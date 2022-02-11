package com.myPark.myPark.service;

import com.myPark.myPark.model.Parking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParkingService {
    public String addParking(Parking parking);
    public Parking updateParking(Long id, Parking parking);
    public List<Parking> listParking();
    void deleteParking(Long id);
    Parking parkingById(Long id);
}
