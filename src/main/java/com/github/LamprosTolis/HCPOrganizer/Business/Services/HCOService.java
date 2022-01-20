package com.github.LamprosTolis.HCPOrganizer.Business.Services;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model.HCO;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.HCO_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class HCOService {

    @Autowired
    HCO_Repository hcoRepository;

    public List<HCO> getAllHCOs(){
        return hcoRepository.findAll();
    }

    public HCO getHCObyName(String name) throws EntityNotFoundException{
        return hcoRepository.findByName(name).orElseThrow(()->new EntityNotFoundException("HCO Name not found"));
    }

    public List<HCO> getAllHCObyName(String name) throws EntityNotFoundException{
        return hcoRepository.findAllByName(name);
    }

    public HCO createHCO(HCO hco) throws EntityExistsException {

        HCO newHCO = new HCO();

        newHCO.setId(hco.getId());
        newHCO.setName(hco.getName());
        newHCO.setSpeciality(hco.getSpeciality());
        newHCO.setAddress(hco.getAddress());
        newHCO.setCountry(hco.getCountry());
        newHCO.setWebsiteURL(hco.getWebsiteURL());
        newHCO.setInfo(hco.getInfo());
        return hcoRepository.save(newHCO);
    }
}
