
package my.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyWebservice", targetNamespace = "http://webservice.my/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyWebservice {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "firstMethod", targetNamespace = "http://webservice.my/", className = "my.webservice.FirstMethod")
    @ResponseWrapper(localName = "firstMethodResponse", targetNamespace = "http://webservice.my/", className = "my.webservice.FirstMethodResponse")
    @Action(input = "http://webservice.my/MyWebservice/firstMethodRequest", output = "http://webservice.my/MyWebservice/firstMethodResponse")
    public String firstMethod();

    /**
     * 
     * @param productName
     * @return
     *     returns my.webservice.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fetchProductDetail", targetNamespace = "http://webservice.my/", className = "my.webservice.FetchProductDetail")
    @ResponseWrapper(localName = "fetchProductDetailResponse", targetNamespace = "http://webservice.my/", className = "my.webservice.FetchProductDetailResponse")
    @Action(input = "http://webservice.my/MyWebservice/fetchProductDetailRequest", output = "http://webservice.my/MyWebservice/fetchProductDetailResponse")
    public Product fetchProductDetail(
        @WebParam(name = "productName", targetNamespace = "")
        String productName);

}
