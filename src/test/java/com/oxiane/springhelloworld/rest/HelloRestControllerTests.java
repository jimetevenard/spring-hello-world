package com.oxiane.springhelloworld.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Tests du HelloRestController
 */
@SpringBootTest
public class HelloRestControllerTests {

    @Autowired
    HelloRestController helloRestController;

    @Test
    void testGetSalutation(){
        assertEquals("Salut, le monde !", helloRestController.getSalutation());
    }

}
