package com.aeropuerto.adminfull.services;

import com.aeropuerto.adminfull.repository.IVueloPasajero;
import com.aeropuerto.adminfull.utileria.Pasajero;
import com.aeropuerto.adminfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueloPasajeroDAO {

    @Autowired
    IVueloPasajero IVueloPasajero;

    public boolean postPasajero(int idvuelo, Pasajero pasajero){

        pasajero.setVuelo(new Vuelo(idvuelo));
        return IVueloPasajero.save(pasajero) != null;
    }
}
