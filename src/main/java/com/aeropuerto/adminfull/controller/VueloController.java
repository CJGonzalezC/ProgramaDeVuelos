package com.aeropuerto.adminfull.controller;

import com.aeropuerto.adminfull.services.VuelosDAO;
import com.aeropuerto.adminfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@Component
public class VueloController {

    @Autowired
    VuelosDAO vueloService;

    @RequestMapping("/vuelo")
    public List<Vuelo> getPasajeros(){

        return vueloService.findALlVuelos();
    }

    @RequestMapping(value="/vuelo/{idVuelo}")
    public Optional<Vuelo> getVueloporId(@PathVariable("idVuelo") int idvuelo){

        return vueloService.consultarVueloporId(idvuelo);

        //Using Query
        //return vueloService.consultarVueloporId(idvuelo);
    }

    @RequestMapping(value = "/vuelo", method = RequestMethod.POST)
    public boolean postVuelo(@RequestBody Vuelo vuelo){

        return vueloService.postVuelo(vuelo);
    }

    @PutMapping("/vuelo/{idvuelo}")
    public boolean putMapping(@PathVariable("idvuelo") int idvuelo, @RequestBody Vuelo vuelo)
    {
        return vueloService.putVuelo(vuelo,idvuelo);
    }

}
