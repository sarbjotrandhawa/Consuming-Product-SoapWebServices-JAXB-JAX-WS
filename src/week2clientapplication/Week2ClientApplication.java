/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2clientapplication;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import my.model.Response;
import my.webservice.MyWebservice;
import my.webservice.Product;
import my.webservice.ProductCatalog;

/**
 *
 * @author macbookair
 */
public class Week2ClientApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductCatalog productCatalog = new ProductCatalog();
        MyWebservice myWebservice = productCatalog.getMyWebservicePort();
        Product product = myWebservice.fetchProductDetail("Mobile");

        System.out.println("******** Product detail from webservices ***********");
        System.out.println("Product Id : " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());

        //Marshalling
        try {
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Response.class);

            //creating the marshaller object
            Marshaller marshallObj = jContext.createMarshaller();

            //setting the values in POJO class
            Response productXml = new Response();
            productXml.setId(product.getId());
            productXml.setName(product.getName());
            productXml.setPrice(product.getPrice());

            //calling the marshall method
            marshallObj.marshal(productXml, new FileOutputStream("response.xml"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Unmarshalling
        Response productXml = null;

        try {
            //getting the xml file to read
            File file = new File("response.xml");

            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Response.class);

            //creating the unmarshall object
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();

            //calling the unmarshall method
            productXml = (Response) unmarshallerObj.unmarshal(file);

            System.out.println("******** After reading data from XML(Unmarshalling) **********");
            System.out.println("Product Id : " + productXml.getId());
            System.out.println("Product Name: " + productXml.getName());
            System.out.println("Product Price: " + productXml.getPrice());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        // setting owner name and date, Marshalling
        try {

            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Response.class);

            //creating the marshaller object
            Marshaller marshallObj = jContext.createMarshaller();

            //setting the values in POJO class
            productXml.setOwnerName("Sarbjot Singh");
            productXml.setDate(new Date());

            //calling the marshall method
            marshallObj.marshal(productXml, new FileOutputStream("response_modified.xml"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
