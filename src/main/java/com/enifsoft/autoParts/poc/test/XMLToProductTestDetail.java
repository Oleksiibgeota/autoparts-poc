package com.enifsoft.autoParts.poc.test;

import com.enifsoft.autoParts.poc.dto.detail.GetPrice;

import javax.xml.bind.JAXB;

public class XMLToProductTestDetail {
    public static GetPrice testXmlToObject() {
        GetPrice getPrice = JAXB.unmarshal("https://tehnomir.com.ua/ws/xml.php?act=GetPrice&usr_login=Autounion&usr_passwd=Tvy188&Number=0986479606", GetPrice.class);
        return getPrice;
    }
    public static void main(String[] args) {
        testXmlToObject().getDetail().stream().forEach(c -> System.out.println(c));
    }
}
