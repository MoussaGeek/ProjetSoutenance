package com.myPark.myPark.controller;

import com.myPark.myPark.model.Parking;
import com.myPark.myPark.repository.ParkingRepository;
import com.myPark.myPark.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/parking/api")
@CrossOrigin("*")
public class ParkingController {
    @Autowired
    ParkingService parkingService;

    @Autowired
    ParkingRepository parkingRepository;

    @PostMapping(value = "/ajouter")
    public void save(@RequestBody Parking parking){
        parkingService.addParking(parking);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        parkingService.deleteParking(id);
    }
    @PutMapping(value = "/modifier/{id}")
    public void update(@RequestBody Parking parking, @PathVariable Long id){
        parkingService.updateParking(id,parking);
    }
    @GetMapping(value = "/liste")
    @ResponseBody
    public List<Parking> list(){return parkingService.listParking();}

    @GetMapping(value = "/parkingById/{id}")
    public Parking ParkingById(@PathVariable("id") Long id) {
        return parkingService.parkingById(id);
    }
}
