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
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for OrderHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarliestArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LatestArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ConfirmationType" type="{}EnumConfirmationType"/>
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CostRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NumberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerType" type="{}EnumGuestTypeCode"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuaranteeMoneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{}EnumOrderStatus"/>
 *         &lt;element name="IsConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteToElong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteToHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddtionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHistory", propOrder = {
    "customerIP",
    "customerName",
    "contactMobile",
    "contactEmail",
    "contactFax",
    "earliestArrivalTime",
    "latestArrivalTime",
    "confirmationType",
    "cardNo",
    "arrivalDate",
    "departureDate",
    "totalPrice",
    "costRate",
    "numberOfRooms",
    "numberOfDays",
    "customerType",
    "roomType",
    "guaranteeMoneyType",
    "orderStatus",
    "isConfirmed",
    "confirmationNumber",
    "noteToElong",
    "noteToHotel",
    "updatedAt",
    "updatedBy",
    "addtionStatus"
})
public class OrderHistory {

    @JSONField(name = "CustomerIP")
    protected String customerIP;
    @JSONField(name = "CustomerName")
    protected String customerName;
    @JSONField(name = "ContactMobile")
    protected String contactMobile;
    @JSONField(name = "ContactEmail")
    protected String contactEmail;
    @JSONField(name = "ContactFax")
    protected String contactFax;
    @JSONField(name = "EarliestArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date earliestArrivalTime;
    @JSONField(name = "LatestArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date latestArrivalTime;
    @JSONField(name = "ConfirmationType")
    @XmlSchemaType(name = "string")
    protected EnumConfirmationType confirmationType;
    @JSONField(name = "CardNo")
    protected long cardNo;
    @JSONField(name = "ArrivalDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date arrivalDate;
    @JSONField(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date departureDate;
    @JSONField(name = "TotalPrice")
    protected BigDecimal totalPrice;
    @JSONField(name = "CostRate")
    protected BigDecimal costRate;
    @JSONField(name = "NumberOfRooms")
    protected int numberOfRooms;
    @JSONField(name = "NumberOfDays")
    protected int numberOfDays;
    @JSONField(name = "CustomerType")
    @XmlSchemaType(name = "string")
    protected EnumGuestTypeCode customerType;
    @JSONField(name = "RoomType")
    protected String roomType;
    @JSONField(name = "GuaranteeMoneyType")
    protected String guaranteeMoneyType;
    @JSONField(name = "OrderStatus")
    @XmlSchemaType(name = "string")
    protected EnumOrderStatus orderStatus;
    @JSONField(name = "IsConfirmed")
    protected boolean isConfirmed;
    @JSONField(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @JSONField(name = "NoteToElong")
    protected String noteToElong;
    @JSONField(name = "NoteToHotel")
    protected String noteToHotel;
    @JSONField(name = "UpdatedAt")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date updatedAt;
    @JSONField(name = "UpdatedBy")
    protected String updatedBy;
    @JSONField(name = "AddtionStatus")
    protected String addtionStatus;

    /**
     * Gets the value of the customerIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIP() {
        return customerIP;
    }

    /**
     * Sets the value of the customerIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIP(String value) {
        this.customerIP = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the contactMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * Sets the value of the contactMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMobile(String value) {
        this.contactMobile = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the value of the contactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

    /**
     * Gets the value of the earliestArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEarliestArrivalTime() {
        return earliestArrivalTime;
    }

    /**
     * Sets the value of the earliestArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEarliestArrivalTime(java.util.Date value) {
        this.earliestArrivalTime = value;
    }

    /**
     * Gets the value of the latestArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getLatestArrivalTime() {
        return latestArrivalTime;
    }

    /**
     * Sets the value of the latestArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setLatestArrivalTime(java.util.Date value) {
        this.latestArrivalTime = value;
    }

    /**
     * Gets the value of the confirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumConfirmationType }
     *     
     */
    public EnumConfirmationType getConfirmationType() {
        return confirmationType;
    }

    /**
     * Sets the value of the confirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumConfirmationType }
     *     
     */
    public void setConfirmationType(EnumConfirmationType value) {
        this.confirmationType = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     */
    public long getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     */
    public void setCardNo(long value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setArrivalDate(java.util.Date value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setDepartureDate(java.util.Date value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the costRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostRate() {
        return costRate;
    }

    /**
     * Sets the value of the costRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostRate(BigDecimal value) {
        this.costRate = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     */
    public void setNumberOfRooms(int value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     */
    public void setNumberOfDays(int value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumGuestTypeCode }
     *     
     */
    public EnumGuestTypeCode getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumGuestTypeCode }
     *     
     */
    public void setCustomerType(EnumGuestTypeCode value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the guaranteeMoneyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeMoneyType() {
        return guaranteeMoneyType;
    }

    /**
     * Sets the value of the guaranteeMoneyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeMoneyType(String value) {
        this.guaranteeMoneyType = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOrderStatus }
     *     
     */
    public EnumOrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOrderStatus }
     *     
     */
    public void setOrderStatus(EnumOrderStatus value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     */
    public boolean isIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     */
    public void setIsConfirmed(boolean value) {
        this.isConfirmed = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the noteToElong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToElong() {
        return noteToElong;
    }

    /**
     * Sets the value of the noteToElong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToElong(String value) {
        this.noteToElong = value;
    }

    /**
     * Gets the value of the noteToHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToHotel() {
        return noteToHotel;
    }

    /**
     * Sets the value of the noteToHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToHotel(String value) {
        this.noteToHotel = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setUpdatedAt(java.util.Date value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the addtionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtionStatus() {
        return addtionStatus;
    }

    /**
     * Sets the value of the addtionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtionStatus(String value) {
        this.addtionStatus = value;
    }

}
