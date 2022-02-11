package com.myPark.myPark.service;

import com.myPark.myPark.model.Automobile;
import com.myPark.myPark.model.Parking;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AutomobileService {
    public String addAutomobile(Automobile automobile);
    public Automobile updateAutomobile(Long id, Automobile automobile);
    public List<Automobile> listAutomobile();
    void deleteAutomobile(Long id);
    Automobile automobileById(Long id);
}
