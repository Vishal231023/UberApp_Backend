package com.codingshuttle.project.uber.uberApp.strategies;


import com.codingshuttle.project.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {
   Double RIDE_FARE_MULTIPLIER = 10.0;
   Double RIDE_SURGE_FARE_MULTIPLIER = 2.0;
    double calculateFare(RideRequest rideRequest);

}
