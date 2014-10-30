//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for BaseValueAddRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseValueAddRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRule">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsInclude" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceOption" type="{}EnumValueAddPriceOption"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsExtAdd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExtOption" type="{}EnumValueAddPriceOption"/>
 *         &lt;element name="ExtPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WeekSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseValueAddRule", propOrder = {
    "typeCode",
    "isInclude",
    "amount",
    "currencyCode",
    "priceOption",
    "price",
    "isExtAdd",
    "extOption",
    "extPrice",
    "startDate",
    "endDate",
    "weekSet"
})
@XmlSeeAlso({
    ValueAdd.class
})
public class BaseValueAddRule
    extends BaseRule
{

    @JSONField(name = "TypeCode")
    protected String typeCode;
    @JSONField(name = "IsInclude")
    protected boolean isInclude;
    @JSONField(name = "Amount")
    protected int amount;
    @JSONField(name = "CurrencyCode")
    protected String currencyCode;
    @JSONField(name = "PriceOption")
    @XmlSchemaType(name = "string")
    protected EnumValueAddPriceOption priceOption;
    @JSONField(name = "Price")
    protected BigDecimal price;
    @JSONField(name = "IsExtAdd")
    protected boolean isExtAdd;
    @JSONField(name = "ExtOption")
    @XmlSchemaType(name = "string")
    protected EnumValueAddPriceOption extOption;
    @JSONField(name = "ExtPrice")
    protected BigDecimal extPrice;
    @JSONField(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date startDate;
    @JSONField(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date endDate;
    @JSONField(name = "WeekSet")
    protected String weekSet;

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the isInclude property.
     * 
     */
    public boolean isIsInclude() {
        return isInclude;
    }

    /**
     * Sets the value of the isInclude property.
     * 
     */
    public void setIsInclude(boolean value) {
        this.isInclude = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the priceOption property.
     * 
     * @return
     *     possible object is
     *     {@link EnumValueAddPriceOption }
     *     
     */
    public EnumValueAddPriceOption getPriceOption() {
        return priceOption;
    }

    /**
     * Sets the value of the priceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumValueAddPriceOption }
     *     
     */
    public void setPriceOption(EnumValueAddPriceOption value) {
        this.priceOption = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the isExtAdd property.
     * 
     */
    public boolean isIsExtAdd() {
        return isExtAdd;
    }

    /**
     * Sets the value of the isExtAdd property.
     * 
     */
    public void setIsExtAdd(boolean value) {
        this.isExtAdd = value;
    }

    /**
     * Gets the value of the extOption property.
     * 
     * @return
     *     possible object is
     *     {@link EnumValueAddPriceOption }
     *     
     */
    public EnumValueAddPriceOption getExtOption() {
        return extOption;
    }

    /**
     * Sets the value of the extOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumValueAddPriceOption }
     *     
     */
    public void setExtOption(EnumValueAddPriceOption value) {
        this.extOption = value;
    }

    /**
     * Gets the value of the extPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtPrice() {
        return extPrice;
    }

    /**
     * Sets the value of the extPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtPrice(BigDecimal value) {
        this.extPrice = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setStartDate(java.util.Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEndDate(java.util.Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the weekSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekSet() {
        return weekSet;
    }

    /**
     * Sets the value of the weekSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekSet(String value) {
        this.weekSet = value;
    }

}
