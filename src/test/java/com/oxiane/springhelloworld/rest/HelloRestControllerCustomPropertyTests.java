package com.oxiane.springhelloworld.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Tests du HelloRestController avec la redéfinition de la Property sous-jacente
 */
@SpringBootTest(properties = { "salutation=Yolo !" })
public class HelloRestControllerCustomPropertyTests {

    @Autowired
    HelloRestController helloRestController;

    @Test
    void testGetSalutation(){
        assertEquals("Yolo !", helloRestController.getSalutation());
    }

}
