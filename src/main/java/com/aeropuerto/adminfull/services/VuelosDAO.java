package com.aeropuerto.adminfull.services;

import com.aeropuerto.adminfull.repository.IVueloRepositery;
import com.aeropuerto.adminfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class VuelosDAO{

    @PersistenceContext
    private EntityManager em;

    //private List<Vuelo>  = new ArrayList<>(Arrays.asList(new Pasajero(1,"Jhovany",15)));

    @Autowired
    IVueloRepositery IVueloRepositery;

    public List<Vuelo> findALlVuelos(){
      return  IVueloRepositery.findAll();
    }

    public boolean posteaVuelo(Vuelo vuelo) {
        return !(IVueloRepositery.save(vuelo) != null ? false : true);
//        if(iVueloRepository.save(vuelo)!= null){
//            return true;
//        }else{
//            return false;
//        }
    }

    public boolean postVuelo(Vuelo vuelo){
        return IVueloRepositery.save(vuelo) != null;
    }

    public Optional<Vuelo> consultarVueloporId(int idVuelo) {

        return IVueloRepositery.findById(idVuelo);
        //return IVueloRepositery.findById(idVuelo).get();
        //return em.createQuery("SELECT p FROM Vuelo p where p="+idVuelo, Vuelo.class).getResultList();
    }

    public boolean putVuelo(Vuelo vuelo, int idvuelo){
        vuelo.setIdVuelo(idvuelo);
        return IVueloRepositery.save(vuelo) != null;
    }
}
