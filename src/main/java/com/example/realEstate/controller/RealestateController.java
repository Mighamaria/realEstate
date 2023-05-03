package com.example.realEstate.controller;

import com.example.realEstate.entity.Realestate;
import com.example.realEstate.service.RealestateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/realestate")
public class RealestateController {
    @Autowired
    private RealestateService realestateService;
    @GetMapping("/selectcity/{city}")
    public List<Realestate> getBasedOnCity(@PathVariable String  city) {
        return realestateService.getBasedOnCity(city);
    }
    @GetMapping("/selectstate/{state}")
    public List<Realestate> getBasedOnState(@PathVariable String state) {
        return realestateService.getBasedOnState(state);
    }

    @GetMapping("/selectcode/{zipcode}")
    public List<Realestate> getBasedOnZipcode(@PathVariable int  zipcode) {
        return realestateService.getBasedOnZipcode(zipcode);
    }
    @GetMapping("/selectprice/{price}")
    public List<Realestate> getBasedOnPrice(@PathVariable double price) {
        return realestateService.getBasedOnPrice(price);
    }
    @GetMapping("/selectbed/{bed}")
    public List<Realestate> getBasedOnBed(@PathVariable int bed) {
        return realestateService.getBasedOnbed(bed);
    }
    @GetMapping("/selectbath/{bath}")
    public List<Realestate> getBasedOnBath(@PathVariable int bath) {
        return realestateService.getBasedOnbath(bath);
    }
    @GetMapping("/selectstatus/{status}")
    public ResponseEntity<Integer> getCountOfForSalePropertiesInCity(@PathVariable String status) {
        int count = realestateService.getCountOfForSalePropertiesInCity(status);
        return ResponseEntity.ok(count);
    }

    // Other controller methods for retrieving and modifying real estate data
}








