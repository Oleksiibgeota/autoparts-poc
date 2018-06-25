package com.enifsoft.autoParts.poc.controller;

import com.enifsoft.autoParts.poc.config.TehnomirConfig;
import com.enifsoft.autoParts.poc.dto.tehnomir.GetPrice;
import com.enifsoft.autoParts.poc.dto.tehnomir.producers.GetProducers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXB;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TestApiController {

    @Autowired
    private TehnomirConfig tehnomirConfig;

    @GetMapping("/producers")
    public ResponseEntity getAllProducers() {
        GetProducers producers = null;
        try {
            producers = JAXB.unmarshal(new URI(tehnomirConfig.getUrlByAction("GetProducers")), GetProducers.class);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(producers.getList().getProducers());
    }

    @GetMapping("/price")
    public ResponseEntity getPriceByNum(@RequestParam("number") String detailNumber,
                                        @RequestParam(value = "brand", required = false) String brandName,
                                        @RequestParam(value = "currency", required = false) String currency) {
        final String numParam = "Number", brandParam = "Brand", currencyParam = "Currency";
        String getPriceUrl = null;
        GetPrice price = null;
        if (!detailNumber.isEmpty()) {
            getPriceUrl = tehnomirConfig.getUrlByAction("GetPrice", numParam, detailNumber, brandParam, brandName, currencyParam, currency);
        }
        if (getPriceUrl == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Requested number of detail not found!");
        } else {
            try {
                price = JAXB.unmarshal(new URI(getPriceUrl), GetPrice.class);
            } catch (URISyntaxException e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Requested brand and/or currency not found!");
            }
            return ResponseEntity.ok(price.getList());
        }
    }
}
