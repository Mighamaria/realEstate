package com.example.realEstate.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
    public class Realestate {
    @Id
        private int id;
        private String status;
        private int bed;
        private int bath;
        private double acre_lot;
        private String city;
        private String state;
        @Column(name = "zip_code")
        private int zipcode;
        private int house_size;
        private String prev_sold_date;
        private double price;


}
