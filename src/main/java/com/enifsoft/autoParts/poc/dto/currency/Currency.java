package com.enifsoft.autoParts.poc.dto.currency;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Currency")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class Currency {
    @XmlElement(name = "Code")
    private String code;
    @XmlElement(name = "Coef")
    private Double coef;

    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", coef=" + coef +
                '}';
    }
}
