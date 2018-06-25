package com.enifsoft.autoparts.poc.dto.tehnomir.currencies;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "Producer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {

    @XmlElement(name = "Id")
    private int id;
    @XmlElement(name = "Name")
    private String name;

}
