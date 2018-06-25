package com.enifsoft.autoParts.poc.dto.tehnomir.detail;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "Detail")
@XmlAccessorType(XmlAccessType.FIELD)
public class Detail {
    @XmlElement(name = "Brand")
    private String brand;
    @XmlElement(name = "Number")
    private int number;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Price")
    private Double price;
    @XmlElement(name = "Currency")
    private String currency;
    @XmlElement(name = "Quantity")
    private int quantity;
    @XmlElement(name = "SupplierCode")
    private String supplierCode;
    @XmlElement(name = "Weight")
    private int weight;
    @XmlElement(name = "DeliveryType")
    private String deliveryType;
    @XmlElement(name = "DeliveryTime")
    private int deliveryTime;
    @XmlElement(name = "DamagedFlag")
    private String damagedFlag;
    @XmlElement(name = "UsedFlag")
    private String usedFlag;
    @XmlElement(name = "RestoredFlag")
    private String restoredFlag;
}
