/*
DriverFactory.java
Driver Factory for driver Entity
Author : Zubair Esau (217100554)
Date 06 April 2022

 */

package za.ac.cput.factory;

import za.ac.cput.entity.Driver;

import java.util.UUID;

public class DriverFactory {
    public static Driver createDriver(String deliveryId, String orderId, String driverName){
        String driverId = Help.generateId();
        return new Driver.Builder().setDriverId(driverId)
                .setDeliveryId(deliveryId)
                .setOrderId(orderId)
                .setDriverName(driverName)
                .build();


    }


    public class Help{
        public static String generateId(){return UUID.randomUUID().toString();}
    }


}
