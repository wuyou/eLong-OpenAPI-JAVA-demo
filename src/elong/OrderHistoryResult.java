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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHistoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderHistories" type="{}ArrayOfOrderHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHistoryResult", propOrder = {
    "orderID",
    "orderHistories"
})
public class OrderHistoryResult {

    @JSONField(name = "OrderID")
    protected int orderID;
    @JSONField(name = "OrderHistories")
    protected List<OrderHistory> orderHistories;

    /**
     * Gets the value of the orderID property.
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderHistories property.
     * 
     * @return
     *     possible object is
     *     {@link List<OrderHistory> }
     *     
     */
    public List<OrderHistory> getOrderHistories() {
        return orderHistories;
    }

    /**
     * Sets the value of the orderHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<OrderHistory> }
     *     
     */
    public void setOrderHistories(List<OrderHistory> value) {
        this.orderHistories = value;
    }

}
