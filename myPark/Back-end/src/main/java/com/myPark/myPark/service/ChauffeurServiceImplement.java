package com.myPark.myPark.service;

import antlr.StringUtils;
import com.myPark.myPark.model.Chauffeur;
import com.myPark.myPark.model.FileUploadUtil;
import com.myPark.myPark.repository.ChauffeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ChauffeurServiceImplement implements ChauffeurService{
    @Autowired
    ChauffeurRepository chauffeurRepository;

    @Override
    public String addChauffeur(Chauffeur chauffeur) {
        chauffeurRepository.save(chauffeur);
        return "chauffeur enregistrer avec succès";
    }

    @Override
    public Chauffeur addImage(Long id, @RequestParam("image") MultipartFile multipartFile) throws IOException{
        Chauffeur chauf = chauffeurRepository.findById(id).get();
        String originalFilename = multipartFile.getOriginalFilename();
        String fileName = (multipartFile.getOriginalFilename());
        chauf.setPhotoPermis(fileName);
        Chauffeur savedchau = chauffeurRepository.save(chauf);
        String uploadDir = "src/main/ressources/asset/" + savedchau.getId();
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return savedchau;
    }

    @Override
    public Chauffeur updateChauffeur(Long id, Chauffeur chauffeur) {
        Chauffeur mod = chauffeurRepository.getById(id);
        mod.setNom(chauffeur.getNom());
        mod.setPrenom(chauffeur.getPrenom());
        mod.setNumeroPermis(chauffeur.getNumeroPermis());
        mod.setPhotoCarte(chauffeur.getPhotoCarte());
        mod.setTelephone(chauffeur.getTelephone());
        mod.setPhotoPermis(chauffeur.getPhotoPermis());
        return chauffeurRepository.save(mod);
    }

    @Override
    public List<Chauffeur> listChauffeur() {
        return chauffeurRepository.findAll();
    }

    @Override
    public void deleteChauffeur(Long id) {
        chauffeurRepository.deleteById(id);

    }

    @Override
    public Chauffeur chauffeurById(Long id) {
        return chauffeurRepository.findById(id).get();
    }

}
