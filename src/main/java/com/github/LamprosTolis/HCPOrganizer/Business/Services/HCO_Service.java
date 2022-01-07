package com.github.LamprosTolis.HCPOrganizer.Business.Services;

import com.github.LamprosTolis.HCPOrganizer.data.model.HCO;
import com.github.LamprosTolis.HCPOrganizer.data.repository.HCO_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HCO_Service {

    @Autowired
    HCO_Repository hco_repository;

    public List<HCO> getAllHCOs(){
        return hco_repository.findAll();
    }

    public List<HCO> getAllHCOByName(String Name){
        return hco_repository.findByName(Name);
    }

}
