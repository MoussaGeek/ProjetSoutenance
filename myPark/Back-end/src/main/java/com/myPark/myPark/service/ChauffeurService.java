package com.myPark.myPark.service;

import com.myPark.myPark.model.Chauffeur;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ChauffeurService {
    public String addChauffeur(Chauffeur chauffeur);
    public Chauffeur addImage(Long id, MultipartFile image) throws IOException;
    public Chauffeur updateChauffeur(Long id, Chauffeur chauffeur);
    public List<Chauffeur> listChauffeur();
    void deleteChauffeur(Long id);
    Chauffeur chauffeurById(Long id);
}
