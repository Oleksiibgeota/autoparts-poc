package com.enifsoft.autoparts.poc.dto.tehnomir.producers;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "Producers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Producers {

    @XmlElement(name = "Producer")
    private List<Producer> producers;

}
