//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 10:34:35 AM CST 
//


package elong;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NightlyRateWithBreakfast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NightlyRateWithBreakfast">
 *   &lt;complexContent>
 *     &lt;extension base="{}NightlyRate">
 *       &lt;sequence>
 *         &lt;element name="BreakfastAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExtraBreakfastPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NightlyRateWithBreakfast", propOrder = {
    "breakfastAmount",
    "extraBreakfastPrice"
})
public class NightlyRateWithBreakfast
    extends NightlyRate
{

    @JSONField(name = "BreakfastAmount")
    protected int breakfastAmount;
    @JSONField(name = "ExtraBreakfastPrice")
    protected BigDecimal extraBreakfastPrice;

    /**
     * Gets the value of the breakfastAmount property.
     * 
     */
    public int getBreakfastAmount() {
        return breakfastAmount;
    }

    /**
     * Sets the value of the breakfastAmount property.
     * 
     */
    public void setBreakfastAmount(int value) {
        this.breakfastAmount = value;
    }

    /**
     * Gets the value of the extraBreakfastPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraBreakfastPrice() {
        return extraBreakfastPrice;
    }

    /**
     * Sets the value of the extraBreakfastPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraBreakfastPrice(BigDecimal value) {
        this.extraBreakfastPrice = value;
    }

}
