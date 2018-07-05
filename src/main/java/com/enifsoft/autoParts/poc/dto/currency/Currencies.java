package com.enifsoft.autoParts.poc.dto.currency;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Currencies")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class Currencies {
    @XmlElement(name = "Currency")
    List<Currency> currency;

    @Override
    public String toString() {
        return "Currencies{" +
                "currency=" + currency +
                '}';
    }
}
