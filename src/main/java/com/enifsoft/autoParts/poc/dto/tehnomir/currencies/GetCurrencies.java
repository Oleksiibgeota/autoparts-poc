package com.enifsoft.autoParts.poc.dto.tehnomir.currencies;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "GetCurrencies")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCurrencies {

    @XmlElement(name = "Currencies")
    private Currencies list;

}
