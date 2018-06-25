package com.enifsoft.autoParts.poc.dto.tehnomir.producers;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "GetProducers")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetProducers {

    @XmlElement(name = "Producers")
    private Producers list;

}
