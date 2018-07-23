package com.enifsoft.autoParts.poc.stax;

import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Example {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String fileName = "test.xml";
        List<Detail> details = parseXML(fileName);
        long finish;
        finish = System.currentTimeMillis() - start;
        for (Detail detail : details) {
            System.out.println(detail.toString());
        }
        System.out.println(finish);
    }

    private static List<Detail> parseXML(String name) {
        List<Detail> details = new ArrayList<>();
        Detail detail = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(name));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("Detail")) {
                        detail = new Detail();
                    } else if (startElement.getName().getLocalPart().equals("Brand")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setBrand(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("Number")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setNumber(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("Name")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("Price")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setPrice(xmlEvent.asCharacters().getData());
                    }else if (startElement.getName().getLocalPart().equals("Currency")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setCurrency(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("Quantity")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setQuantity(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("SupplierCode")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setSupplierCode(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("Weight")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setWeight(xmlEvent.asCharacters().getData());
                    }else if (startElement.getName().getLocalPart().equals("DeliveryType")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setDeliveryType(xmlEvent.asCharacters().getData());
                    }else if (startElement.getName().getLocalPart().equals("DeliveryTime")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setDeliveryTime(xmlEvent.asCharacters().getData());
                    }else if (startElement.getName().getLocalPart().equals("DeliveryDate")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setDeliveryDate(xmlEvent.asCharacters().getData());
                    }else if (startElement.getName().getLocalPart().equals("DamagedFlag")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setDamagedFlag(xmlEvent.asCharacters().getData());
                    }else if (startElement.getName().getLocalPart().equals("RestoredFlag")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setRestoredFlag(xmlEvent.asCharacters().getData());
                    }else if (startElement.getName().getLocalPart().equals("UsedFlag")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        detail.setUsedFlag(xmlEvent.asCharacters().getData());
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("Detail")) {
                        details.add(detail);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return details;
    }
}


@XmlRootElement(name = "GetPrice")
@ToString
class GetPrice {
    @XmlElement(name = "Detail")
    List<Detail> details;
}

@Setter
@ToString
class Detail {
    @XmlElement(name = "Brand")
    private String brand;
    @XmlElement
    private String number;
    @XmlElement
    private String name;
    @XmlElement
    private String price;
    @XmlElement
    private String currency;
    @XmlElement
    private String quantity;
    @XmlElement
    private String supplierCode;
    @XmlElement
    private String weight;
    @XmlElement
    private String deliveryType;
    @XmlElement
    private String deliveryTime;
    @XmlElement
    private String deliveryDate;
    @XmlElement
    private String damagedFlag;
    @XmlElement
    private String usedFlag;
    @XmlElement
    private String restoredFlag;
}
