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
import java.util.Date;


/**
 * <p>Java class for CouponIncrItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponIncrItem">
 *   &lt;complexContent>
 *     &lt;extension base="{}CouponItem">
 *       &lt;sequence>
 *         &lt;element name="LastId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponIncrItem", propOrder = {
    "lastId",
    "changeTime"
})
public class CouponIncrItem
    extends CouponItem
{

    @JSONField(name = "LastId")
    protected long lastId;
    @JSONField(name = "ChangeTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date changeTime;

    /**
     * Gets the value of the lastId property.
     * 
     */
    public long getLastId() {
        return lastId;
    }

    /**
     * Sets the value of the lastId property.
     * 
     */
    public void setLastId(long value) {
        this.lastId = value;
    }

    /**
     * Gets the value of the changeTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getChangeTime() {
        return changeTime;
    }

    /**
     * Sets the value of the changeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setChangeTime(java.util.Date value) {
        this.changeTime = value;
    }

}
