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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_ReferenceSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_ReferenceSystem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}IM_Object">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}RS_ReferenceSystem.name"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RS_ReferenceSystem", propOrder = {
    "rsReferenceSystemName"
})
@XmlSeeAlso({
    RSLRS.class,
    RSCRS.class
})
public abstract class RSReferenceSystem
    extends IMObject
{

    @XmlElement(name = "RS_ReferenceSystem.name", required = true)
    protected RSReferenceSystemName rsReferenceSystemName;

    /**
     * Gets the value of the rsReferenceSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link RSReferenceSystemName }
     *     
     */
    public RSReferenceSystemName getRSReferenceSystemName() {
        return rsReferenceSystemName;
    }

    /**
     * Sets the value of the rsReferenceSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSReferenceSystemName }
     *     
     */
    public void setRSReferenceSystemName(RSReferenceSystemName value) {
        this.rsReferenceSystemName = value;
    }

}
