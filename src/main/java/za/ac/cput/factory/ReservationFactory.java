package za.ac.cput.factory;

import za.ac.cput.entity.Owner;
import za.ac.cput.entity.Reservation;

public class ReservationFactory {
    //creating objects
    public static Reservation.Builder createReservation(int reserveId, String reserveName){

        return new Reservation.Builder().setReserveId(reserveId)
                .setReserveName(reserveName)
                .build();

    }
}
