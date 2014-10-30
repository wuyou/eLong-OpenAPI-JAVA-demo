//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.30 at 10:29:41 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelGeoXML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelGeoXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Districts" type="{}ArrayOfPubObj" minOccurs="0"/>
 *         &lt;element name="CommericalLocations" type="{}ArrayOfPubObj" minOccurs="0"/>
 *         &lt;element name="LandmarkLocations" type="{}ArrayOfPubObj" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProvinceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGeoXML", propOrder = {
    "districts",
    "commericalLocations",
    "landmarkLocations"
})
public class HotelGeoXML {

    @JSONField(name = "Districts")
    protected List<PubObj> districts;
    @JSONField(name = "CommericalLocations")
    protected List<PubObj> commericalLocations;
    @JSONField(name = "LandmarkLocations")
    protected List<PubObj> landmarkLocations;
    @XmlAttribute(name = "Country")
    protected String country;
    @XmlAttribute(name = "ProvinceName")
    protected String provinceName;
    @XmlAttribute(name = "ProvinceId")
    protected String provinceId;
    @XmlAttribute(name = "CityName")
    protected String cityName;
    @XmlAttribute(name = "CityCode")
    protected String cityCode;

    /**
     * Gets the value of the districts property.
     * 
     * @return
     *     possible object is
     *     {@link List<PubObj> }
     *     
     */
    public List<PubObj> getDistricts() {
        return districts;
    }

    /**
     * Sets the value of the districts property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<PubObj> }
     *     
     */
    public void setDistricts(List<PubObj> value) {
        this.districts = value;
    }

    /**
     * Gets the value of the commericalLocations property.
     * 
     * @return
     *     possible object is
     *     {@link List<PubObj> }
     *     
     */
    public List<PubObj> getCommericalLocations() {
        return commericalLocations;
    }

    /**
     * Sets the value of the commericalLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<PubObj> }
     *     
     */
    public void setCommericalLocations(List<PubObj> value) {
        this.commericalLocations = value;
    }

    /**
     * Gets the value of the landmarkLocations property.
     * 
     * @return
     *     possible object is
     *     {@link List<PubObj> }
     *     
     */
    public List<PubObj> getLandmarkLocations() {
        return landmarkLocations;
    }

    /**
     * Sets the value of the landmarkLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<PubObj> }
     *     
     */
    public void setLandmarkLocations(List<PubObj> value) {
        this.landmarkLocations = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the provinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the value of the provinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    /**
     * Gets the value of the provinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * Sets the value of the provinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceId(String value) {
        this.provinceId = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

}
