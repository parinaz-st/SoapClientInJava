set CURRENT_DIR=E:\Sattarzadeh\Codes\github\SoapServiceCilent
set WSDL_LOCATION=E:\Sattarzadeh\Codes\github\SoapServiceCilent\src\main\resources\wsdl\calculator.wsdl

set JAVA_HOME=E:\Development_Tools\jdk1.8.0_171
set path=%JAVA_HOME%/bin
java -classpath E:\Development_Tools\wslib\axis-1.4.jar;E:\Development_Tools\wslib\jaxrpc-api-1.1.jar;E:\Development_Tools\wslib\wsdl4j-1.6.3.jar;E:\Development_Tools\wslib\saaj-api-1.3.jar;E:\Development_Tools\wslib\commons-discovery-0.2.jar;E:\Development_Tools\wslib\commons-logging-1.0.3.jar -Xmx128M org.apache.axis.wsdl.WSDL2Java -pcom.loadwsdl.clientSamat -Umenaghd -P3Z24NY8TMI4-4 -T1.2 -o%CURRENT_DIR%\src\main\java %WSDL_LOCATION%