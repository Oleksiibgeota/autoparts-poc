package com.enifsoft.autoParts.poc.dto.currency;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "GetCurrencies")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class GetCurrencies {
    @XmlElement(name = "Currencies")
    Currencies currencies;

    @Override
    public String toString() {
        return "GetCurrencies{" +
                "currencies=" + currencies +
                '}';
    }
}
