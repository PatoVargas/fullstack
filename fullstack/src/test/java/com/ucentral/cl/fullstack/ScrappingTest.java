
package com.ucentral.cl.fullstack;

import com.ucentral.cl.fullstack.InterfaceRepository.CineRepositorieInterface;
import com.ucentral.cl.fullstack.InterfaceServices.CineServiceInterface;
import com.ucentral.cl.fullstack.Model.Cine;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author patricio
 */
public class ScrappingTest {
    
    @Autowired
    CineServiceInterface cineServiceInterface;
    
    @Autowired
    CineRepositorieInterface cineRepositorieInterface;
    public ScrappingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        Cine cine = new Cine("hoyts", "San antonio");
        System.out.println(cine.getName());
        System.out.println(cine.getAddress());
    }
    
    @Test
    public void createCine(){
        System.out.println("HOLA");
    }
}
