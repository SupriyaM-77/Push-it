package com.example.Demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Hello {
    @RequestMapping("/greet")
    public String hello(){

        return  "hello world";
    }
    @RequestMapping("/thanks")
    public String bye(){
        return  "byee";
    }

    @RequestMapping("/add")
    public int add(){
        int n1=2;
        int n2 = 2;
        return n1+n2 ;
    }

    @RequestMapping("/sub")
    public int sub(){
        int n1=2;
        int n2 = 2;
        return n1-n2 ;
    }

    @RequestMapping("/mul")
    public int mul(){
        int n1=4;
        int n2 = 2;
        return n1*n2 ;
    }
}
