/**
 * CalculatorLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.loadwsdl.clientcalculator;

public class CalculatorLocator extends org.apache.axis.client.Service implements com.loadwsdl.clientcalculator.Calculator {

    public CalculatorLocator() {
    }


    public CalculatorLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculatorLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculatorSoap
    private java.lang.String CalculatorSoap_address = "http://www.dneonline.com/calculator.asmx";

    public java.lang.String getCalculatorSoapAddress() {
        return CalculatorSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculatorSoapWSDDServiceName = "CalculatorSoap";

    public java.lang.String getCalculatorSoapWSDDServiceName() {
        return CalculatorSoapWSDDServiceName;
    }

    public void setCalculatorSoapWSDDServiceName(java.lang.String name) {
        CalculatorSoapWSDDServiceName = name;
    }

    public com.loadwsdl.clientcalculator.CalculatorSoap_PortType getCalculatorSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculatorSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculatorSoap(endpoint);
    }

    public com.loadwsdl.clientcalculator.CalculatorSoap_PortType getCalculatorSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.loadwsdl.clientcalculator.CalculatorSoap_BindingStub _stub = new com.loadwsdl.clientcalculator.CalculatorSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCalculatorSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculatorSoapEndpointAddress(java.lang.String address) {
        CalculatorSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.loadwsdl.clientcalculator.CalculatorSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.loadwsdl.clientcalculator.CalculatorSoap_BindingStub _stub = new com.loadwsdl.clientcalculator.CalculatorSoap_BindingStub(new java.net.URL(CalculatorSoap_address), this);
                _stub.setPortName(getCalculatorSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculatorSoap".equals(inputPortName)) {
            return getCalculatorSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Calculator");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "CalculatorSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculatorSoap".equals(portName)) {
            setCalculatorSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
