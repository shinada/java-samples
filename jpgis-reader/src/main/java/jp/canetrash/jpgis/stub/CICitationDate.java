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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}CI_Date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ciDate"
})
@XmlRootElement(name = "CI_Citation.date")
public class CICitationDate {

    @XmlElement(name = "CI_Date", required = true)
    protected CIDate ciDate;

    /**
     * Gets the value of the ciDate property.
     * 
     * @return
     *     possible object is
     *     {@link CIDate }
     *     
     */
    public CIDate getCIDate() {
        return ciDate;
    }

    /**
     * Sets the value of the ciDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIDate }
     *     
     */
    public void setCIDate(CIDate value) {
        this.ciDate = value;
    }

}
