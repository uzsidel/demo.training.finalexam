package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PetMovementController {
    @GetMapping("/")
    public String listaPersonas() {

        return "Total de personas inscritas";
    }



}
