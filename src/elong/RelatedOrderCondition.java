//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 10:34:35 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedOrderCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedOrderCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationType" type="{}EnumOrderRelationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedOrderCondition", propOrder = {
    "orderIds",
    "relationType"
})
public class RelatedOrderCondition {

    @JSONField(name = "OrderIds")
    protected String orderIds;
    @JSONField(name = "RelationType")
    @XmlSchemaType(name = "string")
    protected EnumOrderRelationType relationType;

    /**
     * Gets the value of the orderIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIds() {
        return orderIds;
    }

    /**
     * Sets the value of the orderIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIds(String value) {
        this.orderIds = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOrderRelationType }
     *     
     */
    public EnumOrderRelationType getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOrderRelationType }
     *     
     */
    public void setRelationType(EnumOrderRelationType value) {
        this.relationType = value;
    }

}
