package com.enifsoft.autoparts.poc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {
    private int partId;
    private int brandId;
    private String brand;
    private int partNumber;
    private int partNumberShort;
    private String partDescriptionRus;
    private Double price;
    private String currency;
    private int quantity;
    private String quantityType;
    private String priceLogo;
    private int Weight;
    private String priceDescrShort;
    private String priceDescrLong;
    private String deliveryType;
    private int deliveryDays;
    private String deliveryDate;
    private Double deliveryPercent;
    private String priceChangeDate;
    private String DamagedFlag;
    private String usedFlag;
    private String originalFlag;
    private String oldPartNumberFlag;
    private String returnFlag;
    private String priceFinalFlag;
    private int group;
}
