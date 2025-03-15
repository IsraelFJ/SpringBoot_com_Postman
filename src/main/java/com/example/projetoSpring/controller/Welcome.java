package com.example.projetoSpring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Welcome {

    @GetMapping
    public String start(){
        return "Pagina inicial de caminhos de end point";
    }

    @GetMapping("/welcome")
    public String welcome(){

        return "Welcome to the project Java with SpringBoot and Postman (◕‿◕)\n";
    }//end points são orientações de navegação

    @GetMapping("/lanchonete")
     public  String lanchonete(){
        return "Sanduiche de presunto do Chaves, churros da dona Florinda";
    }


}
        /*Criado pasta controller pra far o teste e pagina na eendereço localhost:8080 */