package com.example.realEstate.repository;

import com.example.realEstate.entity.Realestate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RealestateRepository extends JpaRepository<Realestate,Integer> {
    List<Realestate> findByZipcode(int zipcode);

    List<Realestate> findByCity(String city);

    List<Realestate> findByState(String state);

    List<Realestate> findByPrice(double price);

    List<Realestate> findByBed(int bed);

    List<Realestate> findByBath(int bath);

    List<Realestate> findByStatus(String status);
}
