//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 10:34:35 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCreditCardProcessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCreditCardProcessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DirectCharge"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Auth"/>
 *     &lt;enumeration value="CancelAuth"/>
 *     &lt;enumeration value="Charge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCreditCardProcessType")
@XmlEnum
public enum EnumCreditCardProcessType {

    @XmlEnumValue("DirectCharge")
    DirectCharge("DirectCharge"),
    @XmlEnumValue("Refund")
    Refund("Refund"),
    @XmlEnumValue("Auth")
    Auth("Auth"),
    @XmlEnumValue("CancelAuth")
    CancelAuth("CancelAuth"),
    @XmlEnumValue("Charge")
    Charge("Charge");
    private final String value;

    EnumCreditCardProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCreditCardProcessType fromValue(String v) {
        for (EnumCreditCardProcessType c: EnumCreditCardProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
