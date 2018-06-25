package com.enifsoft.autoparts.poc.dto.tehnomir;

import com.enifsoft.autoparts.poc.dto.tehnomir.detail.Detail;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "GetPrice")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetPrice {
    @XmlElement(name = "Detail")
    private List<Detail> list;
}
