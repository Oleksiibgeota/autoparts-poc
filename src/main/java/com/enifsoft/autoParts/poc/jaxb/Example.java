package com.enifsoft.autoParts.poc.jaxb;

import lombok.ToString;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.List;

public class Example {
    public static void main(String[] args) throws JAXBException {
        File file = new File("test.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(GetPrice.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        long start = System.currentTimeMillis();
        GetPrice obj = (GetPrice) unmarshaller.unmarshal(file);
        long finish;
        finish = System.currentTimeMillis() - start;
        System.out.println(obj);
        System.out.println(obj.details.size());
        System.out.println(finish);
    }
}

@XmlRootElement(name = "GetPrice")
@ToString
class GetPrice {
    @XmlElement(name = "Detail")
    List<Detail> details;
}

@ToString
class Detail {
    @XmlElement(name = "Brand")
    private String brand;
    @XmlElement(name = "Number")
    private String number;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Price")
    private String price;
    @XmlElement(name = "Currency")
    private String currency;
    @XmlElement(name = "Quantity")
    private String quantity;
    @XmlElement(name = "SupplierCode")
    private String supplierCode;
    @XmlElement(name = "Weight")
    private String weight;
    @XmlElement(name = "DeliveryType")
    private String deliveryType;
    @XmlElement(name = "DeliveryTime")
    private String deliveryTime;
    @XmlElement(name = "DeliveryDate")
    private String deliveryDate;
    @XmlElement(name = "Damagedflag")
    private String damagedFlag;
    @XmlElement(name = "UsedFlag")
    private String usedFlag;
    @XmlElement(name = "RestoredFlag")
    private String restoredFlag;
}