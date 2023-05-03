package com.example.realEstate.service;

import com.example.realEstate.entity.Realestate;
import com.example.realEstate.repository.RealestateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RealestateService {
    @Autowired
    private RealestateRepository realestateRepository;
    public List<Realestate> getBasedOnZipcode(int zipcode) {
     return realestateRepository.findByZipcode(zipcode);

    }

    public List<Realestate> getBasedOnCity(String city) {
        return  realestateRepository.findByCity(city);
    }

    public List<Realestate> getBasedOnState(String state) {
        return realestateRepository.findByState(state);
    }

    public List<Realestate> getBasedOnPrice(double price) {
        return realestateRepository.findByPrice(price);
    }

    public List<Realestate> getBasedOnbed(int bed) {
        return realestateRepository.findByBed(bed);
    }

    public List<Realestate> getBasedOnbath(int bath) {
        return realestateRepository.findByBath(bath);
    }

    public int getCountOfForSalePropertiesInCity(String city) {
        List<Realestate> propertiesInCity = realestateRepository.findByStatus(city);
        int count = (int) propertiesInCity.stream()
                .filter(p -> p.getStatus().equals("for_sale"))
                .count();
        return count;
    }
    }
