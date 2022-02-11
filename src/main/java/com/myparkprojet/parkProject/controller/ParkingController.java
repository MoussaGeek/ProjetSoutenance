package com.myparkprojet.parkProject.controller;

import com.myparkprojet.parkProject.model.Parking;
import com.myparkprojet.parkProject.repository.ParkingRepository;
import com.myparkprojet.parkProject.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/parking/api")
@CrossOrigin("*")
public class ParticipantController {
    @Autowired
    ParkingService parkingService;

    @Autowired
    ParkingRepository parkingRepository;

    @PostMapping(value = "/parking")
    public void save(@RequestBody Parking parking){
        parkingService.addParking(parking);
    }
    @DeleteMapping(value = "/deleteParking/{id}")
    public void delete(@PathVariable("id") Long id){
        parkingService.deleteParking(id);
    }
    @PutMapping(value = "/parking{id}")
    public void update(@RequestBody Parking parking, @PathVariable Long id){
        parkingService.updateParking(id,parking);
    }
    @GetMapping(value = "/parking")
    @ResponseBody
    public List<Parking> list(){return parkingService.listParking();}

    @GetMapping(value = "/parkingById/{id}")
    public Parking ParkingById(@PathVariable("id") Long id) {
        return parkingService.parkingById(id);
    }
}
