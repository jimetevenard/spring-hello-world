package com.oxiane.springhelloworld.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    
    public static final String HELLO = "Salut, le monde !";

    /**
     * Retourne la salutation en texte brut.
     * Mappée sur application/json, sera retournée par exemple dans postman ou curl.
     */
    @GetMapping(path = "/", produces = "application/json")
    public String hello(){
        return HELLO;
    }

    /**
     * Retourne également la salutation mais en HTML.
     * Mappée sur text/html, sera plutôt apellée lors de l'accès via, par exemple, un navigateur web.
     */
    @GetMapping(path = "/", produces = "text/html")
    public String helloHtml(){
        return "<!DOCTYPE html>"
          + "<head><title>" + HELLO + "</title></head>"
          + "<body><h1>" + HELLO + "</h1></body>"
          + "</html>";
    }
}
