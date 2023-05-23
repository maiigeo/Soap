
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TeoremaPitagoras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TeoremaPitagoras"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Catetoa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Catetob" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeoremaPitagoras", propOrder = {
    "catetoa",
    "catetob"
})
public class TeoremaPitagoras {

    @XmlElement(name = "Catetoa")
    protected int catetoa;
    @XmlElement(name = "Catetob")
    protected int catetob;

    /**
     * Obtiene el valor de la propiedad catetoa.
     * 
     */
    public int getCatetoa() {
        return catetoa;
    }

    /**
     * Define el valor de la propiedad catetoa.
     * 
     */
    public void setCatetoa(int value) {
        this.catetoa = value;
    }

    /**
     * Obtiene el valor de la propiedad catetob.
     * 
     */
    public int getCatetob() {
        return catetob;
    }

    /**
     * Define el valor de la propiedad catetob.
     * 
     */
    public void setCatetob(int value) {
        this.catetob = value;
    }

}
