//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.26 at 01:19:58 �ߑO JST 
//


package jp.canetrash.jpgis.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GM_Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GM_Point">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}GM_Primitive">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}GM_Point.position"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GM_Point", propOrder = {
    "gmPointPosition"
})
public class GMPoint
    extends GMPrimitive
{

    @XmlElement(name = "GM_Point.position", required = true)
    protected GMPointPosition gmPointPosition;

    /**
     * Gets the value of the gmPointPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GMPointPosition }
     *     
     */
    public GMPointPosition getGMPointPosition() {
        return gmPointPosition;
    }

    /**
     * Sets the value of the gmPointPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMPointPosition }
     *     
     */
    public void setGMPointPosition(GMPointPosition value) {
        this.gmPointPosition = value;
    }

}
