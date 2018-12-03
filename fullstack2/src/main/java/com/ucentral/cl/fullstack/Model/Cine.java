
package com.ucentral.cl.fullstack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cine")
@Entity
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Cine() {
    }

    public Cine(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Cine(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Cine{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }
    
}
