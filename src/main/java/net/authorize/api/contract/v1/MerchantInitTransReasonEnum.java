//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.14 at 11:09:15 AM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for merchantInitTransReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="merchantInitTransReasonEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="resubmission"/>
 *     &lt;enumeration value="delayedCharge"/>
 *     &lt;enumeration value="reauthorization"/>
 *     &lt;enumeration value="noShow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "merchantInitTransReasonEnum")
@XmlEnum
public enum MerchantInitTransReasonEnum {

    @XmlEnumValue("resubmission")
    RESUBMISSION("resubmission"),
    @XmlEnumValue("delayedCharge")
    DELAYED_CHARGE("delayedCharge"),
    @XmlEnumValue("reauthorization")
    REAUTHORIZATION("reauthorization"),
    @XmlEnumValue("noShow")
    NO_SHOW("noShow");
    private final String value;

    MerchantInitTransReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchantInitTransReasonEnum fromValue(String v) {
        for (MerchantInitTransReasonEnum c: MerchantInitTransReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
