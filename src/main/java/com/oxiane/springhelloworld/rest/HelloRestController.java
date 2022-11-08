package com.oxiane.springhelloworld.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    
    @Value(value = "${salutation}")
    public String salutation;

    /**
     * @return la valeur de la salution
     */
    String getSalutation(){
        return this.salutation;
    }

    /**
     * Retourne la salutation en texte brut.
     * Mappée sur application/json, sera retournée par exemple dans postman ou curl.
     */
    @GetMapping(path = "/", produces = "application/json")
    public String hello(){
        return getSalutation();
    }

    /**
     * Retourne également la salutation mais en HTML.
     * Mappée sur text/html, sera plutôt apellée lors de l'accès via, par exemple, un navigateur web.
     */
    @GetMapping(path = "/", produces = "text/html")
    public String helloHtml(){
        return "<!DOCTYPE html>"
          + "<head><title>" + getSalutation() + "</title></head>"
          + "<body><h1>" + getSalutation() + "</h1></body>"
          + "</html>";
    }
}
