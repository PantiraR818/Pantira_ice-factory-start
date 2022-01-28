package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.model.Camera;
import nvc.bcit.icefactory.model.Event;
import nvc.bcit.icefactory.model.Factory;
import nvc.bcit.icefactory.repository.CameraRepository;
import nvc.bcit.icefactory.repository.EventRepository;
import nvc.bcit.icefactory.repository.FactoryRepository;

@Service
public class FactoryService {

    @Autowired
    CameraRepository cameraRepository;

    @Autowired
    FactoryRepository factoryRepository;

    //Get all Factory
    public List<Factory> findAll(){
        return factoryRepository.findAll();
    }

    // Get FactoryById
    public Factory getById(int id){
        return factoryRepository.getById(id);
    }



    

}
