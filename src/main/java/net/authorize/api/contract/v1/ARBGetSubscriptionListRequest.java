//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiRequest">
 *       &lt;sequence>
 *         &lt;element name="searchType" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ARBGetSubscriptionListSearchTypeEnum"/>
 *         &lt;element name="sorting" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ARBGetSubscriptionListSorting" minOccurs="0"/>
 *         &lt;element name="paging" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}Paging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchType",
    "sorting",
    "paging"
})
@XmlRootElement(name = "ARBGetSubscriptionListRequest")
public class ARBGetSubscriptionListRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ARBGetSubscriptionListSearchTypeEnum searchType;
    protected ARBGetSubscriptionListSorting sorting;
    protected Paging paging;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link ARBGetSubscriptionListSearchTypeEnum }
     *     
     */
    public ARBGetSubscriptionListSearchTypeEnum getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBGetSubscriptionListSearchTypeEnum }
     *     
     */
    public void setSearchType(ARBGetSubscriptionListSearchTypeEnum value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link ARBGetSubscriptionListSorting }
     *     
     */
    public ARBGetSubscriptionListSorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBGetSubscriptionListSorting }
     *     
     */
    public void setSorting(ARBGetSubscriptionListSorting value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

}
