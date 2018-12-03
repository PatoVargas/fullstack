
package com.ucentral.cl.fullstack.Model;

import javax.persistence.Id;
import org.bson.types.ObjectId;

/**
 *
 * @author patricio
 */
public class Cinemongo {
    
    @Id
    public ObjectId _id;
    public String name;
    public String address;

    public Cinemongo() {
    }

    public Cinemongo(ObjectId _id, String name, String address) {
        this._id = _id;
        this.name = name;
        this.address = address;
    }
  
    public String get_id() { 
        return _id.toHexString(); 
    }
   
    public void set_id(ObjectId _id) {
        this._id = _id; 
    }

    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
