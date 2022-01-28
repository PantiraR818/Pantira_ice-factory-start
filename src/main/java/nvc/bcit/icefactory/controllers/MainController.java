package nvc.bcit.icefactory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nvc.bcit.icefactory.model.Camera;
import nvc.bcit.icefactory.model.Factory;
import nvc.bcit.icefactory.repository.CameraRepository;
import nvc.bcit.icefactory.repository.EventRepository;
import nvc.bcit.icefactory.repository.FactoryRepository;
import nvc.bcit.icefactory.service.FactoryService;

@Controller
public class MainController {

    @Autowired
    FactoryService factoryService;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    CameraRepository cameraRepository;

    @Autowired
    FactoryRepository factoryRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/factory")
    public ModelAndView getFactories(){
        List<Factory> factories = factoryService.findAll();
        return new ModelAndView("factory","factories",factories);
    }

    @GetMapping("/factory/{id}")
    public String getFactory(){
        return "factory-detail";
    }

    @GetMapping("/factory-detail")
    public String getfactorydetail(){
        return "factory-detail";
    }

    // @GetMapping("/factory/{id}")
    // public ModelAndView getFactory(@PathVariable int id){
    //     Factory factories = factoryService.getById(id);
    //     return new ModelAndView("factory","factories",factories);
    // }
}
