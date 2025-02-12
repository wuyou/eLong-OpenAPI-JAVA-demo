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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{}EnumPaymentType"/>
 *         &lt;element name="BreakfastAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExtraBreakfastPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RoomAmenityIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExtraBedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AverageBaseRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyCode" type="{}EnumCurrencyCode"/>
 *         &lt;element name="CurrentAlloment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CancelRuleType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LatestCancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ProductTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nights" type="{}ArrayOfNightlyRateWithBreakfast" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "hotelCode",
    "roomId",
    "roomTypeId",
    "roomName",
    "ratePlanId",
    "ratePlanName",
    "paymentType",
    "breakfastAmount",
    "extraBreakfastPrice",
    "roomAmenityIds",
    "averageRate",
    "extraBedPrice",
    "averageBaseRate",
    "coupon",
    "currencyCode",
    "currentAlloment",
    "cancelRuleType",
    "latestCancelTime",
    "productTypes",
    "giftIds",
    "nights",
    "status"
})
public class Product {

    @JSONField(name = "HotelCode")
    protected String hotelCode;
    @JSONField(name = "RoomId")
    protected String roomId;
    @JSONField(name = "RoomTypeId")
    protected String roomTypeId;
    @JSONField(name = "RoomName")
    protected String roomName;
    @JSONField(name = "RatePlanId")
    protected int ratePlanId;
    @JSONField(name = "RatePlanName")
    protected String ratePlanName;
    @JSONField(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected EnumPaymentType paymentType;
    @JSONField(name = "BreakfastAmount")
    protected int breakfastAmount;
    @JSONField(name = "ExtraBreakfastPrice")
    protected BigDecimal extraBreakfastPrice;
    @JSONField(name = "RoomAmenityIds")
    protected String roomAmenityIds;
    @JSONField(name = "AverageRate")
    protected BigDecimal averageRate;
    @JSONField(name = "ExtraBedPrice")
    protected BigDecimal extraBedPrice;
    @JSONField(name = "AverageBaseRate")
    protected BigDecimal averageBaseRate;
    @JSONField(name = "Coupon")
    protected BigDecimal coupon;
    @JSONField(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected EnumCurrencyCode currencyCode;
    @JSONField(name = "CurrentAlloment")
    protected int currentAlloment;
    @JSONField(name = "CancelRuleType")
    protected int cancelRuleType;
    @JSONField(name = "LatestCancelTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date latestCancelTime;
    @JSONField(name = "ProductTypes")
    protected String productTypes;
    @JSONField(name = "GiftIds")
    protected String giftIds;
    @JSONField(name = "Nights")
    protected List<NightlyRateWithBreakfast> nights;
    @JSONField(name = "Status")
    protected Boolean status;

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomId(String value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * Gets the value of the ratePlanId property.
     * 
     */
    public int getRatePlanId() {
        return ratePlanId;
    }

    /**
     * Sets the value of the ratePlanId property.
     * 
     */
    public void setRatePlanId(int value) {
        this.ratePlanId = value;
    }

    /**
     * Gets the value of the ratePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * Sets the value of the ratePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPaymentType }
     *     
     */
    public EnumPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPaymentType }
     *     
     */
    public void setPaymentType(EnumPaymentType value) {
        this.paymentType = value;
    }

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

    /**
     * Gets the value of the roomAmenityIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmenityIds() {
        return roomAmenityIds;
    }

    /**
     * Sets the value of the roomAmenityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmenityIds(String value) {
        this.roomAmenityIds = value;
    }

    /**
     * Gets the value of the averageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageRate() {
        return averageRate;
    }

    /**
     * Sets the value of the averageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageRate(BigDecimal value) {
        this.averageRate = value;
    }

    /**
     * Gets the value of the extraBedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraBedPrice() {
        return extraBedPrice;
    }

    /**
     * Sets the value of the extraBedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraBedPrice(BigDecimal value) {
        this.extraBedPrice = value;
    }

    /**
     * Gets the value of the averageBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageBaseRate() {
        return averageBaseRate;
    }

    /**
     * Sets the value of the averageBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageBaseRate(BigDecimal value) {
        this.averageBaseRate = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoupon(BigDecimal value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public EnumCurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public void setCurrencyCode(EnumCurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currentAlloment property.
     * 
     */
    public int getCurrentAlloment() {
        return currentAlloment;
    }

    /**
     * Sets the value of the currentAlloment property.
     * 
     */
    public void setCurrentAlloment(int value) {
        this.currentAlloment = value;
    }

    /**
     * Gets the value of the cancelRuleType property.
     * 
     */
    public int getCancelRuleType() {
        return cancelRuleType;
    }

    /**
     * Sets the value of the cancelRuleType property.
     * 
     */
    public void setCancelRuleType(int value) {
        this.cancelRuleType = value;
    }

    /**
     * Gets the value of the latestCancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getLatestCancelTime() {
        return latestCancelTime;
    }

    /**
     * Sets the value of the latestCancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setLatestCancelTime(java.util.Date value) {
        this.latestCancelTime = value;
    }

    /**
     * Gets the value of the productTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypes() {
        return productTypes;
    }

    /**
     * Sets the value of the productTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypes(String value) {
        this.productTypes = value;
    }

    /**
     * Gets the value of the giftIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftIds() {
        return giftIds;
    }

    /**
     * Sets the value of the giftIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftIds(String value) {
        this.giftIds = value;
    }

    /**
     * Gets the value of the nights property.
     * 
     * @return
     *     possible object is
     *     {@link List<NightlyRateWithBreakfast> }
     *     
     */
    public List<NightlyRateWithBreakfast> getNights() {
        return nights;
    }

    /**
     * Sets the value of the nights property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<NightlyRateWithBreakfast> }
     *     
     */
    public void setNights(List<NightlyRateWithBreakfast> value) {
        this.nights = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

}
