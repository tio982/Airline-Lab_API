package com.example.AirlineLab.repositories;

import com.example.AirlineLab.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
