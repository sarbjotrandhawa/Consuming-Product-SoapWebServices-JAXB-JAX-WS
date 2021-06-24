# Consuming-Product-SoapWebServices-JAXB-JAX-WS
This is small demo of web-service client to consume product web-service data and marshalling and un-marshalling it to XML and POJO respectively. Used JAXB for marshalling(Java Object to XML) and un-marshalling(XML to Java Object). JAX-WS is used for creating soap web service.  

1) Create a small Web Service. Examine the WSDL. Invoke a method to get a single XML response returned.

2) Create a new Netbeans Java Application, and create an XML file called response.xml inside the /test directory (under the files tab) and paste the XML there.

3) Create a POJO file that will map to the XML response, using annotations to bind your XML data. Add two extra properties (Name and CreatedDate).

4) Use the Unmarshaller object to read the XML contents into a POJO file within your project called response.java.

5) Populate Name and CreatedDate with your name and the current date and time.

6) Marshal the object to an XML file in your /test directory called response_modified.xml.
