package com.enifsoft.autoParts.poc.dto.tehnomir.currencies;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "Currencies")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currencies {

    @XmlElement(name = "Currency")
    private List<Currency> currencies;

}
