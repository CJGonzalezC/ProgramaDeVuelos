package com.aeropuerto.adminfull.controller;

import com.aeropuerto.adminfull.services.PasajerosDAO;

import com.aeropuerto.adminfull.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
public class PasajeroController {


    @Autowired
    PasajerosDAO pasajeroservice;

    @RequestMapping("/pasajero")
    public List<Pasajero> getPasajeros(){

        return pasajeroservice.getPasajeros();
    }

    @RequestMapping(value = "/pasajero", method = RequestMethod.POST)
    public boolean postPasajero(@RequestBody Pasajero pasajero){
        return pasajeroservice.postPasajero(pasajero);
    }
}
