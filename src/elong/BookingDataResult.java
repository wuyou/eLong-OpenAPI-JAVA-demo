//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingDataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlan" type="{}RatePlan" minOccurs="0"/>
 *         &lt;element name="WeekendStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WeekendEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingRules" type="{}ArrayOfBaseBookingRule" minOccurs="0"/>
 *         &lt;element name="Inventories" type="{}ArrayOfInventory" minOccurs="0"/>
 *         &lt;element name="Rates" type="{}ArrayOfRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingDataResult", propOrder = {
    "ratePlan",
    "weekendStart",
    "weekendEnd",
    "bookingRules",
    "inventories",
    "rates"
})
public class BookingDataResult {

    @JSONField(name = "RatePlan")
    protected RatePlan ratePlan;
    @JSONField(name = "WeekendStart")
    protected Integer weekendStart;
    @JSONField(name = "WeekendEnd")
    protected Integer weekendEnd;
    @JSONField(name = "BookingRules")
    protected List<BaseBookingRule> bookingRules;
    @JSONField(name = "Inventories")
    protected List<Inventory> inventories;
    @JSONField(name = "Rates")
    protected List<Rate> rates;

    /**
     * Gets the value of the ratePlan property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlan }
     *     
     */
    public RatePlan getRatePlan() {
        return ratePlan;
    }

    /**
     * Sets the value of the ratePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlan }
     *     
     */
    public void setRatePlan(RatePlan value) {
        this.ratePlan = value;
    }

    /**
     * Gets the value of the weekendStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekendStart() {
        return weekendStart;
    }

    /**
     * Sets the value of the weekendStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekendStart(Integer value) {
        this.weekendStart = value;
    }

    /**
     * Gets the value of the weekendEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekendEnd() {
        return weekendEnd;
    }

    /**
     * Sets the value of the weekendEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekendEnd(Integer value) {
        this.weekendEnd = value;
    }

    /**
     * Gets the value of the bookingRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<BaseBookingRule> }
     *     
     */
    public List<BaseBookingRule> getBookingRules() {
        return bookingRules;
    }

    /**
     * Sets the value of the bookingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<BaseBookingRule> }
     *     
     */
    public void setBookingRules(List<BaseBookingRule> value) {
        this.bookingRules = value;
    }

    /**
     * Gets the value of the inventories property.
     * 
     * @return
     *     possible object is
     *     {@link List<Inventory> }
     *     
     */
    public List<Inventory> getInventories() {
        return inventories;
    }

    /**
     * Sets the value of the inventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Inventory> }
     *     
     */
    public void setInventories(List<Inventory> value) {
        this.inventories = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link List<Rate> }
     *     
     */
    public List<Rate> getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Rate> }
     *     
     */
    public void setRates(List<Rate> value) {
        this.rates = value;
    }

}
