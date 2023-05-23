
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _AreaC_QNAME = new QName("http://sw/", "AreaC");
    private final static QName _AreaCResponse_QNAME = new QName("http://sw/", "AreaCResponse");
    private final static QName _Dividir_QNAME = new QName("http://sw/", "Dividir");
    private final static QName _DividirResponse_QNAME = new QName("http://sw/", "DividirResponse");
    private final static QName _GradosCaF_QNAME = new QName("http://sw/", "GradosCaF");
    private final static QName _GradosCaFResponse_QNAME = new QName("http://sw/", "GradosCaFResponse");
    private final static QName _Ingresar_QNAME = new QName("http://sw/", "Ingresar");
    private final static QName _IngresarResponse_QNAME = new QName("http://sw/", "IngresarResponse");
    private final static QName _Multiplicar_QNAME = new QName("http://sw/", "Multiplicar");
    private final static QName _MultiplicarResponse_QNAME = new QName("http://sw/", "MultiplicarResponse");
    private final static QName _Restar_QNAME = new QName("http://sw/", "Restar");
    private final static QName _RestarResponse_QNAME = new QName("http://sw/", "RestarResponse");
    private final static QName _Sumar_QNAME = new QName("http://sw/", "Sumar");
    private final static QName _SumarResponse_QNAME = new QName("http://sw/", "SumarResponse");
    private final static QName _TeoremaPitagoras_QNAME = new QName("http://sw/", "TeoremaPitagoras");
    private final static QName _TeoremaPitagorasResponse_QNAME = new QName("http://sw/", "TeoremaPitagorasResponse");
    private final static QName _EuroADolar_QNAME = new QName("http://sw/", "euroADolar");
    private final static QName _EuroADolarResponse_QNAME = new QName("http://sw/", "euroADolarResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AreaC }
     * 
     */
    public AreaC createAreaC() {
        return new AreaC();
    }

    /**
     * Create an instance of {@link AreaCResponse }
     * 
     */
    public AreaCResponse createAreaCResponse() {
        return new AreaCResponse();
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link GradosCaF }
     * 
     */
    public GradosCaF createGradosCaF() {
        return new GradosCaF();
    }

    /**
     * Create an instance of {@link GradosCaFResponse }
     * 
     */
    public GradosCaFResponse createGradosCaFResponse() {
        return new GradosCaFResponse();
    }

    /**
     * Create an instance of {@link Ingresar }
     * 
     */
    public Ingresar createIngresar() {
        return new Ingresar();
    }

    /**
     * Create an instance of {@link IngresarResponse }
     * 
     */
    public IngresarResponse createIngresarResponse() {
        return new IngresarResponse();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link Restar }
     * 
     */
    public Restar createRestar() {
        return new Restar();
    }

    /**
     * Create an instance of {@link RestarResponse }
     * 
     */
    public RestarResponse createRestarResponse() {
        return new RestarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link TeoremaPitagoras }
     * 
     */
    public TeoremaPitagoras createTeoremaPitagoras() {
        return new TeoremaPitagoras();
    }

    /**
     * Create an instance of {@link TeoremaPitagorasResponse }
     * 
     */
    public TeoremaPitagorasResponse createTeoremaPitagorasResponse() {
        return new TeoremaPitagorasResponse();
    }

    /**
     * Create an instance of {@link EuroADolar }
     * 
     */
    public EuroADolar createEuroADolar() {
        return new EuroADolar();
    }

    /**
     * Create an instance of {@link EuroADolarResponse }
     * 
     */
    public EuroADolarResponse createEuroADolarResponse() {
        return new EuroADolarResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "AreaC")
    public JAXBElement<AreaC> createAreaC(AreaC value) {
        return new JAXBElement<AreaC>(_AreaC_QNAME, AreaC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "AreaCResponse")
    public JAXBElement<AreaCResponse> createAreaCResponse(AreaCResponse value) {
        return new JAXBElement<AreaCResponse>(_AreaCResponse_QNAME, AreaCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "DividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradosCaF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "GradosCaF")
    public JAXBElement<GradosCaF> createGradosCaF(GradosCaF value) {
        return new JAXBElement<GradosCaF>(_GradosCaF_QNAME, GradosCaF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradosCaFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "GradosCaFResponse")
    public JAXBElement<GradosCaFResponse> createGradosCaFResponse(GradosCaFResponse value) {
        return new JAXBElement<GradosCaFResponse>(_GradosCaFResponse_QNAME, GradosCaFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingresar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Ingresar")
    public JAXBElement<Ingresar> createIngresar(Ingresar value) {
        return new JAXBElement<Ingresar>(_Ingresar_QNAME, Ingresar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "IngresarResponse")
    public JAXBElement<IngresarResponse> createIngresarResponse(IngresarResponse value) {
        return new JAXBElement<IngresarResponse>(_IngresarResponse_QNAME, IngresarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "MultiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Restar")
    public JAXBElement<Restar> createRestar(Restar value) {
        return new JAXBElement<Restar>(_Restar_QNAME, Restar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "RestarResponse")
    public JAXBElement<RestarResponse> createRestarResponse(RestarResponse value) {
        return new JAXBElement<RestarResponse>(_RestarResponse_QNAME, RestarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "SumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeoremaPitagoras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "TeoremaPitagoras")
    public JAXBElement<TeoremaPitagoras> createTeoremaPitagoras(TeoremaPitagoras value) {
        return new JAXBElement<TeoremaPitagoras>(_TeoremaPitagoras_QNAME, TeoremaPitagoras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeoremaPitagorasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "TeoremaPitagorasResponse")
    public JAXBElement<TeoremaPitagorasResponse> createTeoremaPitagorasResponse(TeoremaPitagorasResponse value) {
        return new JAXBElement<TeoremaPitagorasResponse>(_TeoremaPitagorasResponse_QNAME, TeoremaPitagorasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroADolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroADolar")
    public JAXBElement<EuroADolar> createEuroADolar(EuroADolar value) {
        return new JAXBElement<EuroADolar>(_EuroADolar_QNAME, EuroADolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroADolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroADolarResponse")
    public JAXBElement<EuroADolarResponse> createEuroADolarResponse(EuroADolarResponse value) {
        return new JAXBElement<EuroADolarResponse>(_EuroADolarResponse_QNAME, EuroADolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
