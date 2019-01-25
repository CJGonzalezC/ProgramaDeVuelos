package com.aeropuerto.adminfull.controller;

import com.aeropuerto.adminfull.services.VueloPasajeroDAO;
import com.aeropuerto.adminfull.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VueloPasajeroController {

    @Autowired
    VueloPasajeroDAO vuelopasajeroDAO;


    @RequestMapping(value = "/vuelo/{idVuelo}/pasajero", method = RequestMethod.POST)
    public boolean PostPasajeroDeVuelo(@PathVariable("idVuelo") int idVuelo, @RequestBody Pasajero pasajero){

        return vuelopasajeroDAO.postPasajero(idVuelo,pasajero);
    }

//    @RequestMapping(value = "/{idVuelo}/pasajero/{idPasajero}", method = RequestMethod.GET)
//    public Pasajero GetUnPasajerodeVuelo(@PathVariable("idVuelo") int idVuelo, @PathVariable("idPasajero") int idPasajero){
//
//        //return vueloservice.findPasajeros();
//    }

}
