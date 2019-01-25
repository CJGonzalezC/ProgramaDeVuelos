package com.aeropuerto.adminfull.services;

import com.aeropuerto.adminfull.repository.IPasajeroRepository;
import com.aeropuerto.adminfull.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Service
public class PasajerosDAO {

    //private List<Pasajero> pasajeros = new ArrayList<>(Arrays.asList(new Pasajero(1,"Jhovany",15)));

    @Autowired
    IPasajeroRepository IPasajeroRepository;

    public List<Pasajero> getPasajeros(){

        return IPasajeroRepository.findAll();
    }

    @PostMapping
    public boolean postPasajero(Pasajero pasajero){
        return IPasajeroRepository.save(pasajero) != null ? false : true;
    }
}
