
package my.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FirstMethod_QNAME = new QName("http://webservice.my/", "firstMethod");
    private final static QName _FirstMethodResponse_QNAME = new QName("http://webservice.my/", "firstMethodResponse");
    private final static QName _FetchProductDetailResponse_QNAME = new QName("http://webservice.my/", "fetchProductDetailResponse");
    private final static QName _FetchProductDetail_QNAME = new QName("http://webservice.my/", "fetchProductDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FetchProductDetail }
     * 
     */
    public FetchProductDetail createFetchProductDetail() {
        return new FetchProductDetail();
    }

    /**
     * Create an instance of {@link FirstMethodResponse }
     * 
     */
    public FirstMethodResponse createFirstMethodResponse() {
        return new FirstMethodResponse();
    }

    /**
     * Create an instance of {@link FetchProductDetailResponse }
     * 
     */
    public FetchProductDetailResponse createFetchProductDetailResponse() {
        return new FetchProductDetailResponse();
    }

    /**
     * Create an instance of {@link FirstMethod }
     * 
     */
    public FirstMethod createFirstMethod() {
        return new FirstMethod();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.my/", name = "firstMethod")
    public JAXBElement<FirstMethod> createFirstMethod(FirstMethod value) {
        return new JAXBElement<FirstMethod>(_FirstMethod_QNAME, FirstMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.my/", name = "firstMethodResponse")
    public JAXBElement<FirstMethodResponse> createFirstMethodResponse(FirstMethodResponse value) {
        return new JAXBElement<FirstMethodResponse>(_FirstMethodResponse_QNAME, FirstMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.my/", name = "fetchProductDetailResponse")
    public JAXBElement<FetchProductDetailResponse> createFetchProductDetailResponse(FetchProductDetailResponse value) {
        return new JAXBElement<FetchProductDetailResponse>(_FetchProductDetailResponse_QNAME, FetchProductDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.my/", name = "fetchProductDetail")
    public JAXBElement<FetchProductDetail> createFetchProductDetail(FetchProductDetail value) {
        return new JAXBElement<FetchProductDetail>(_FetchProductDetail_QNAME, FetchProductDetail.class, null, value);
    }

}
