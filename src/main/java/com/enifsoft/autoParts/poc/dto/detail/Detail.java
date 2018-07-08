package com.enifsoft.autoParts.poc.dto.detail;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Detail")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
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
    @XmlElement(name = "SupplierCde")
    private String supplierCode;
    @XmlElement(name = "Quantity")
    private int quantity;
    @XmlElement(name = "Weight")
    private int weight;
    @XmlElement(name = "DeliveryType")
    private String deliveryType;
    @XmlElement(name = "DeliveryTime")
    private int deliveryTime;
    @XmlElement(name = "DeliveryDate")
    private String deliveryDate;
    @XmlElement(name = "DamageFlag")
    private String damagedFlag;
    @XmlElement(name = "UsedFlag")
    private String usedFlag;
    @XmlElement(name = "RestoredFlag")
    private String restoredFlag;

    @Override
    public String toString() {
        return "Detail{" +
                "brand='" + brand + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", supplierCode='" + supplierCode + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", deliveryType='" + deliveryType + '\'' +
                ", deliveryTime=" + deliveryTime +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", damagedFlag='" + damagedFlag + '\'' +
                ", usedFlag='" + usedFlag + '\'' +
                ", restoredFlag='" + restoredFlag + '\'' +
                '}';
    }
}
