package com.myPark.myPark.controller;

import com.myPark.myPark.model.Automobile;
import com.myPark.myPark.model.Chauffeur;
import com.myPark.myPark.model.Parking;
import com.myPark.myPark.repository.ChauffeurRepository;
import com.myPark.myPark.service.AutomobileService;
import com.myPark.myPark.service.ChauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public class ChauffeurController {
    @Autowired
    ChauffeurService chauffeurService;

    @Autowired
    ChauffeurRepository chauffeurRepository;

    @PostMapping(value = "/ajouter")
    public void save(@RequestBody Chauffeur chauffeur){
        chauffeurService.addChauffeur(chauffeur);
    }

    public Chauffeur addImage(@PathVariable Long id, @RequestParam("image") MultipartFile multipartFile) throws IOException {
        return chauffeurService.addImage(id, multipartFile);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        chauffeurService.deleteChauffeur(id);
    }

    @PutMapping(value = "/modifier/{id}")
    public void update(@RequestBody Chauffeur chauffeur, @PathVariable Long id){
        chauffeurService.updateChauffeur(id,chauffeur);
    }
    @GetMapping(value = "/liste")
    @ResponseBody
    public List<Chauffeur> list(){return chauffeurService.listChauffeur();}

    @GetMapping(value = "/parkingById/{id}")
    public Chauffeur chauffeurById(@PathVariable("id") Long id) {
        return chauffeurService.chauffeurById(id);
    }

}
