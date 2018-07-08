package com.enifsoft.autoParts.poc.dto.detail;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "GetPrice")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class GetPrice {
    @XmlElement(name = "Detail")
    private List<Detail> detail;

    @Override
    public String toString() {
        return "GetPrice{" +
                "detail=" + detail +
                '}';
    }
}
