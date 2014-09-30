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
 * <p>Java class for JP_GridEnvelope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JP_GridEnvelope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JP_GridEnvelope.low" type="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}JP_Coordinate"/>
 *         &lt;element name="JP_GridEnvelope.high" type="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}JP_Coordinate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JP_GridEnvelope", propOrder = {
    "jpGridEnvelopeLow",
    "jpGridEnvelopeHigh"
})
public class JPGridEnvelope {

    @XmlElement(name = "JP_GridEnvelope.low", namespace = "", required = true)
    protected JPCoordinate jpGridEnvelopeLow;
    @XmlElement(name = "JP_GridEnvelope.high", namespace = "", required = true)
    protected JPCoordinate jpGridEnvelopeHigh;

    /**
     * Gets the value of the jpGridEnvelopeLow property.
     * 
     * @return
     *     possible object is
     *     {@link JPCoordinate }
     *     
     */
    public JPCoordinate getJPGridEnvelopeLow() {
        return jpGridEnvelopeLow;
    }

    /**
     * Sets the value of the jpGridEnvelopeLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPCoordinate }
     *     
     */
    public void setJPGridEnvelopeLow(JPCoordinate value) {
        this.jpGridEnvelopeLow = value;
    }

    /**
     * Gets the value of the jpGridEnvelopeHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JPCoordinate }
     *     
     */
    public JPCoordinate getJPGridEnvelopeHigh() {
        return jpGridEnvelopeHigh;
    }

    /**
     * Sets the value of the jpGridEnvelopeHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPCoordinate }
     *     
     */
    public void setJPGridEnvelopeHigh(JPCoordinate value) {
        this.jpGridEnvelopeHigh = value;
    }

}
