
package com.ucentral.cl.fullstack.Controllers;

import com.ucentral.cl.fullstack.InterfaceServices.CineServiceInterface;
import com.ucentral.cl.fullstack.Model.Cine;
import com.ucentral.cl.fullstack.Model.Cinemongo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CineController {
    
    @Autowired
    CineServiceInterface cineServiceInterface;
    
    @GetMapping(value = "/cines")
    public List<Cine> getAll(){
        List<Cine> cines = cineServiceInterface.getAll();
        return cines;
    }
    
    @GetMapping(value="/cines/{id}")
    public Optional<Cine> getOneById(@PathVariable String id){
        Optional<Cine> cine = cineServiceInterface.getOneById(Long.parseLong(id));
        return cine;
    }
    
    @PostMapping(value = "/cines")
    public Cine createOneCine(@RequestBody Cine cine){
        cineServiceInterface.createOneCine(cine);
        return cine;
    }
    
    @GetMapping("/cinesMongo")
    public List<Cinemongo> getAllMongo(){
        List<Cinemongo> cines = cineServiceInterface.getAllMongo();
        return cines;
    }
    
    @GetMapping("/cinesMongoPost")
    public  void createMongo(){
        cineServiceInterface.createMongo();
    }
}
