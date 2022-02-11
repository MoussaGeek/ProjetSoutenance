package com.myPark.myPark.service;

import com.myPark.myPark.model.Automobile;
import com.myPark.myPark.model.Chauffeur;
import com.myPark.myPark.model.Parking;
import com.myPark.myPark.repository.AutomobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
@Service
public class AutomobileServiceImplement implements AutomobileService{
    @Autowired
    AutomobileRepository automobileRepository;
    @Override
    public String addAutomobile(Automobile automobile) {
        automobileRepository.save(automobile);
        return "chauffeur enregistrer avec succès";
    }

    @Override
    public Automobile updateAutomobile(Long id, Automobile automobile) {
        Automobile mod = automobileRepository.getById(id);
        mod.setAnnee(automobile.getAnnee());
        mod.setModele(automobile.getModele());
        mod.setMarque(automobile.getMarque());
        mod.setNbrePlace(automobile.getNbrePlace());
        mod.setCarburant(automobile.getCarburant());
        mod.setType(automobile.getType());
        return automobileRepository.save(mod);
    }

    @Override
    public List<Automobile> listAutomobile() {
        return automobileRepository.findAll();
    }

    @Override
    public void deleteAutomobile(Long id) {
        automobileRepository.deleteById(id);
    }

    @Override
    public Automobile automobileById(Long id) {
        return automobileRepository.findById(id).get();
    }

}
