
package com.ucentral.cl.fullstack.ImplService;

import com.ucentral.cl.fullstack.InterfaceRepository.CineMongoRepositorie;
import com.ucentral.cl.fullstack.InterfaceRepository.CineRepositorieInterface;
import com.ucentral.cl.fullstack.InterfaceServices.CineServiceInterface;
import com.ucentral.cl.fullstack.Model.Cine;
import com.ucentral.cl.fullstack.Model.Cinemongo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServiceImpl implements CineServiceInterface{

    @Autowired
    CineRepositorieInterface cineRepositorieInterface;
    
    @Autowired
    CineMongoRepositorie cineMongoRepositorie;
    
    @Override
    public List<Cine> getAll() {
        List<Cine> cines = cineRepositorieInterface.findAll();
        return cines;
    }

    @Override
    public Optional<Cine> getOneById(Long id) {
        Optional<Cine> cine = cineRepositorieInterface.findById(id);
        cine.toString();
        return cine;
    }

    @Override
    public Cine createOneCine(Cine cine) {
        cineRepositorieInterface.save(cine);
        return cine;
    }

    @Override
    public List<Cinemongo> getAllMongo() {
        List<Cinemongo> cines = cineMongoRepositorie.findAll();
        System.out.println("*****" + cineMongoRepositorie.count());        
        return cines;
    }

    @Override
    public void createMongo() {
        Cinemongo cine = new Cinemongo();
        cine.setName("Cine Artes");
        cine.setAddress("Santa Isabel");
        cineMongoRepositorie.save(cine);
    }
    
}
