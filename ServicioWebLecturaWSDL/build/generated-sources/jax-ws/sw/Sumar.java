
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sumar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sumar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dato1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Dato2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sumar", propOrder = {
    "dato1",
    "dato2"
})
public class Sumar {

    @XmlElement(name = "Dato1")
    protected int dato1;
    @XmlElement(name = "Dato2")
    protected int dato2;

    /**
     * Obtiene el valor de la propiedad dato1.
     * 
     */
    public int getDato1() {
        return dato1;
    }

    /**
     * Define el valor de la propiedad dato1.
     * 
     */
    public void setDato1(int value) {
        this.dato1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dato2.
     * 
     */
    public int getDato2() {
        return dato2;
    }

    /**
     * Define el valor de la propiedad dato2.
     * 
     */
    public void setDato2(int value) {
        this.dato2 = value;
    }

}
