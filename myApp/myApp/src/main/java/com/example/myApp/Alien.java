package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
   // @Autowired  //field injection
    Laptop laptop;

    public Alien(Laptop laptop){
        //constructor injection
        Laptop Laptop;
        this.laptop =  laptop;
    }


    public void build(){
        laptop.compile();
        System.out.println("working");

    }
}
