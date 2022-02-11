package com.myPark.myPark.controller;

import com.myPark.myPark.model.Automobile;
import com.myPark.myPark.model.Parking;
import com.myPark.myPark.repository.AutomobileRepository;
import com.myPark.myPark.repository.ParkingRepository;
import com.myPark.myPark.service.AutomobileService;
import com.myPark.myPark.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/automobile")
@CrossOrigin("*")
public class AutomobileController {

    @Autowired
    AutomobileService automobileService;

    @Autowired
    AutomobileRepository automobileRepository;

    @PostMapping(value = "/ajouter")
    public void save(@RequestBody Automobile automobile){
        automobileService.addAutomobile(automobile);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        automobileService.deleteAutomobile(id);
    }

    @PutMapping(value = "/modifier/{id}")
    public void update(@RequestBody Automobile automobile, @PathVariable Long id){
        automobileService.updateAutomobile(id,automobile);
    }

    @GetMapping(value = "/liste")
    @ResponseBody
    public List<Automobile> list(){return automobileService.listAutomobile();}

    @GetMapping(value = "/automobileById/{id}")
    public Automobile AutomobileById(@PathVariable("id") Long id) {
        return automobileService.automobileById(id);
    }


}
