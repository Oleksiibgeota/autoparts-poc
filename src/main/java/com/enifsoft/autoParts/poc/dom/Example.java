package com.enifsoft.autoParts.poc.dom;

import lombok.Setter;
import lombok.ToString;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("test.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new FileInputStream(file));
        List<Detail> details = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Detail detail = new Detail();

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);
                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "Brand":
                                detail.setBrand(content);
                                count++;
                                break;
                            case "Number":
                                detail.setNumber(content);
                                break;
                            case "Name":
                                detail.setName(content);
                                break;
                            case "Price":
                                detail.setPrice(content);
                                break;
                            case "Currency":
                                detail.setCurrency(content);
                                break;
                            case "Quantity":
                                detail.setQuantity(content);
                                break;
                            case "SupplierCode":
                                detail.setSupplierCode(content);
                                break;
                            case "Weight":
                                detail.setWeight(content);
                                break;
                            case "DeliveryType":
                                detail.setDeliveryType(content);
                                break;
                            case "DeliveryTime":
                                detail.setDeliveryTime(content);
                                break;
                            case "DeliveryDate":
                                detail.setDeliveryDate(content);
                                break;
                            case "DamagedFlag":
                                detail.setDamagedFlag(content);
                                break;
                            case "UsedFlag":
                                detail.setUsedFlag(content);
                                break;
                            case "RestoredFlag":
                                detail.setRestoredFlag(content);
                                break;
                        }
                    }
                }
                details.add(detail);
            }
        }
        for (Detail detail : details) {
            System.out.println(detail);
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println(finish);
        System.out.println(count);

    }


    @Setter
    @ToString
    static class Detail {
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
}


