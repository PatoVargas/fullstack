
package com.ucentral.cl.fullstack.InterfaceServices;

import com.ucentral.cl.fullstack.Model.Cine;
import com.ucentral.cl.fullstack.Model.Cinemongo;
import java.util.List;
import java.util.Optional;

public interface CineServiceInterface {
    
    public List<Cine> getAll();
    
    public List<Cinemongo> getAllMongo();

    public Optional<Cine> getOneById(Long id);
    
    public Cine createOneCine(Cine cine);
    
    public void createMongo();
}
