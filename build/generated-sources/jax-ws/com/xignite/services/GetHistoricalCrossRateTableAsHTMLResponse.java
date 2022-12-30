
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetHistoricalCrossRateTableAsHTMLResult" type="{http://www.xignite.com/services/}HTMLCrossRateTable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHistoricalCrossRateTableAsHTMLResult"
})
@XmlRootElement(name = "GetHistoricalCrossRateTableAsHTMLResponse")
public class GetHistoricalCrossRateTableAsHTMLResponse {

    @XmlElement(name = "GetHistoricalCrossRateTableAsHTMLResult")
    protected HTMLCrossRateTable getHistoricalCrossRateTableAsHTMLResult;

    /**
     * Gets the value of the getHistoricalCrossRateTableAsHTMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLCrossRateTable }
     *     
     */
    public HTMLCrossRateTable getGetHistoricalCrossRateTableAsHTMLResult() {
        return getHistoricalCrossRateTableAsHTMLResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRateTableAsHTMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLCrossRateTable }
     *     
     */
    public void setGetHistoricalCrossRateTableAsHTMLResult(HTMLCrossRateTable value) {
        this.getHistoricalCrossRateTableAsHTMLResult = value;
    }

}
