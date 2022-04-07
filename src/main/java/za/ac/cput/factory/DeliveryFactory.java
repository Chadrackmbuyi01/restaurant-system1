/*
DeliveryFactory.java
Delivery Factory for delivery Entity
Author : Zubair Esau (217100554)
Date 06 April 2022

 */

package za.ac.cput.factory;

import za.ac.cput.entity.Delivery;
import za.ac.cput.entity.Driver;

import java.util.UUID;

public class DeliveryFactory {

    public static Delivery createDelivery(String deliveryId, String orderId){
        return new Delivery.Builder().setDeliveryId(Integer.parseInt(deliveryId))
                .setOrderId(Integer.parseInt(orderId))
                .build();


    }

}