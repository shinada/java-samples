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
 * <p>Java class for GM_CurveSegments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GM_CurveSegments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}IM_Object">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.gsi.go.jp/GIS/jpgis/standardSchemas}GM_CurveSegment.interpolation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GM_CurveSegments", propOrder = {
    "gmCurveSegmentInterpolation"
})
@XmlSeeAlso({
    GMArcString.class,
    GMLineString.class
})
public abstract class GMCurveSegments
    extends IMObject
{

    @XmlElement(name = "GM_CurveSegment.interpolation", required = true)
    protected GMCurveInterpolation gmCurveSegmentInterpolation;

    /**
     * Gets the value of the gmCurveSegmentInterpolation property.
     * 
     * @return
     *     possible object is
     *     {@link GMCurveInterpolation }
     *     
     */
    public GMCurveInterpolation getGMCurveSegmentInterpolation() {
        return gmCurveSegmentInterpolation;
    }

    /**
     * Sets the value of the gmCurveSegmentInterpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMCurveInterpolation }
     *     
     */
    public void setGMCurveSegmentInterpolation(GMCurveInterpolation value) {
        this.gmCurveSegmentInterpolation = value;
    }

}