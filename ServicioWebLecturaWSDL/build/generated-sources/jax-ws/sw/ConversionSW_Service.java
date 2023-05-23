
package sw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConversionSW", targetNamespace = "http://sw/", wsdlLocation = "http://localhost:8080/ServiciosWebSoap/ConversionSW?WSDL")
public class ConversionSW_Service
    extends Service
{

    private final static URL CONVERSIONSW_WSDL_LOCATION;
    private final static WebServiceException CONVERSIONSW_EXCEPTION;
    private final static QName CONVERSIONSW_QNAME = new QName("http://sw/", "ConversionSW");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServiciosWebSoap/ConversionSW?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERSIONSW_WSDL_LOCATION = url;
        CONVERSIONSW_EXCEPTION = e;
    }

    public ConversionSW_Service() {
        super(__getWsdlLocation(), CONVERSIONSW_QNAME);
    }

    public ConversionSW_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERSIONSW_QNAME, features);
    }

    public ConversionSW_Service(URL wsdlLocation) {
        super(wsdlLocation, CONVERSIONSW_QNAME);
    }

    public ConversionSW_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERSIONSW_QNAME, features);
    }

    public ConversionSW_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConversionSW_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConversionSW
     */
    @WebEndpoint(name = "ConversionSWPort")
    public ConversionSW getConversionSWPort() {
        return super.getPort(new QName("http://sw/", "ConversionSWPort"), ConversionSW.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConversionSW
     */
    @WebEndpoint(name = "ConversionSWPort")
    public ConversionSW getConversionSWPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sw/", "ConversionSWPort"), ConversionSW.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERSIONSW_EXCEPTION!= null) {
            throw CONVERSIONSW_EXCEPTION;
        }
        return CONVERSIONSW_WSDL_LOCATION;
    }

}
