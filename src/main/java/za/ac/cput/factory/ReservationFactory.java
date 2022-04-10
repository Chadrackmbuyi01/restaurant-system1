/*
 *ReservationFactory.java
 * VuyolwethuKalolo
 * 214015637
 * 06-04-2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Reservation;

public class ReservationFactory {
    //creating objects
    public static Reservation createReservation(int reserveId, String reserveName){

        return new Reservation.Builder().setReserveId(reserveId)
                .setReserveName(reserveName)
                .build();

    }
}
