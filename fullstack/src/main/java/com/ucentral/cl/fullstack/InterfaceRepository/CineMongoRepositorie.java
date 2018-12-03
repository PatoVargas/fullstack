
package com.ucentral.cl.fullstack.InterfaceRepository;

import com.ucentral.cl.fullstack.Model.Cinemongo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CineMongoRepositorie extends MongoRepository<Cinemongo, String>{
    
}
