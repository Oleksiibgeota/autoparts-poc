package com.enifsoft.autoParts.poc.domain;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class Producer {
    @XmlAttribute(name="id")
    private int id;
    @XmlAttribute(name="name")
    private String name;
}
