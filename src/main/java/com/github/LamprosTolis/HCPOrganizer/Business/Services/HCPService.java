package com.github.LamprosTolis.HCPOrganizer.Business.Services;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model.HCP;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.HCP_Repository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.text.MessageFormat;
import java.util.List;


@Service
public class HCPService {

    @Autowired
    HCP_Repository hcpRepository;

    HCP newHCP = new HCP();

    Logger logger;

    public List<HCP> getAllHCPs(){
        return hcpRepository.findAll();
    }

    public HCP createHCP(HCP hcp) throws EntityExistsException {
//        try {

            newHCP.setId(hcp.getId());
            newHCP.setLastName(hcp.getLastName());
            newHCP.setFirstName(hcp.getFirstName());
            newHCP.setSpeciality(hcp.getSpeciality());
            newHCP.setEmail(hcp.getEmail());
            newHCP.setAddress(hcp.getAddress());
            newHCP.setCountry(hcp.getCountry());
            newHCP.setStatus(hcp.isStatus());
            newHCP.setInfo(hcp.getInfo());
            return hcpRepository.save(newHCP);
//        }
//        catch (EntityExistsException e){
//            logger.info(MessageFormat.format("Exception: {0}", e));
//        }
//        return hcpRepository.save(newHCP);
    }
}
