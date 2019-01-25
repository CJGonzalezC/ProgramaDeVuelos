package com.aeropuerto.adminfull.repository;

import com.aeropuerto.adminfull.utileria.Pasajero;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IPasajeroRepository extends JpaRepository<Pasajero, Integer> {
}
