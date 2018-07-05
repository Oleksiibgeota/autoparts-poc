package com.enifsoft.autoParts.poc.test;

import com.enifsoft.autoParts.poc.dto.currency.GetCurrencies;

import javax.xml.bind.JAXB;

public class XMLToProductTestCurrency {

    public static GetCurrencies testXmlToObject() {
        GetCurrencies getCurrencies = JAXB.unmarshal("https://tehnomir.com.ua/ws/xml.php?act=GetCurrencies&usr_login=Autounion&usr_passwd=Tvy188&Number=0986479606", GetCurrencies.class);
        return getCurrencies;
    }

    public static void main(String[] args) {
        testXmlToObject().getCurrencies().getCurrency().stream().forEach(c -> System.out.println(c.getCode()));
    }
}
