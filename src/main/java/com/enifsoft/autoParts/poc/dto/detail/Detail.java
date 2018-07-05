package com.enifsoft.autoParts.poc.dto.detail;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Detail {
    private String brand;
    private int number;
    private String name;
    private Double price;
    private String currency;
    private String supplierCode;
    private int quantity;
    private int weight;
    private String deliveryType;
    private int deliveryTime;
    private String deliveryDate;
    private String damagedFlag;
    private String usedFlag;
    private String restoredFlag;
}
