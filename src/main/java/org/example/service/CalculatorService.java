package org.example.service;

import com.loadwsdl.clientcalculator.CalculatorLocator;
import com.loadwsdl.clientcalculator.CalculatorSoap_PortType;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLHandshakeException;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.rmi.RemoteException;

@Service
public class CalculatorService {
    @Value("${calculator.url}")
    private String serviceUrl;

    public Integer callAdd(int a, int b) throws Exception {
        try {
            CalculatorSoap_PortType calculatorSoapPortType = new CalculatorLocator().getCalculatorSoap(new URL(serviceUrl));
            return calculatorSoapPortType.add(a, b);
        } catch (Throwable e) {
            if (e instanceof MalformedURLException) {
                System.out.println("MalformedURLException, " + e.getCause());
            } else if (e instanceof ServiceException) {
                System.out.println("ServiceException" + e.getCause());
            } else if (e instanceof RemoteException) {
                System.out.println("RemoteException" + e.getCause());
            } else if (e instanceof SocketTimeoutException) {
                System.out.println("SocketTimeoutException" + e.getCause());
            } else if (e instanceof ConnectTimeoutException) {
                System.out.println("ConnectTimeoutException" + e.getCause());
            } else if (e instanceof HttpHostConnectException) {
                System.out.println("HttpHostConnectException" + e.getCause());
            } else if (e instanceof SSLHandshakeException) {
                System.out.println("SSLHandshakeException" + e.getCause());
            } else {
                System.out.println(e.getStackTrace());
                throw e;
            }
        }
        return null;
    }
}
