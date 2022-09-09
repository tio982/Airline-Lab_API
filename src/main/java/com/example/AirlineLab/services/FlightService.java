package com.example.AirlineLab.services;

import com.example.AirlineLab.models.Flight;
import com.example.AirlineLab.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerService passengerService;


    public List<Flight> getAllflights() {
    }
}
