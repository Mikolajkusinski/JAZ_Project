package com.jaz.JazProject.Services;

import com.jaz.JazProject.entities.InfoAboutClient;
import com.jaz.JazProject.enumes.TypeOfBuldingEnum;
import com.jaz.JazProject.exceptions.InfoAlreadyExistException;
import com.jaz.JazProject.exceptions.InfoNotFoundException;
import com.jaz.JazProject.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class InfoService {

    private InfoRepository infoRepository;

    @Autowired
    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public InfoAboutClient getInfoFromRepo(String id){
        InfoAboutClient infoAboutClient = infoRepository.findById(Long.parseLong(id));

        if(infoAboutClient == null){
            throw new InfoNotFoundException();
        }

        return infoAboutClient;
    }

    public void insertInfoInToRepo(InfoAboutClient infoAboutClient){
        infoRepository.save(infoAboutClient);
    }

    public List<InfoAboutClient> getAllInfoFromRepo(){return infoRepository.findAll();}

    public void deleteInfo(String id){
        InfoAboutClient infoAboutClient = infoRepository.findById(Long.parseLong(id));

        if(infoAboutClient == null){
            throw new InfoNotFoundException();
        }

        infoRepository.delete(infoAboutClient);
    }
}
