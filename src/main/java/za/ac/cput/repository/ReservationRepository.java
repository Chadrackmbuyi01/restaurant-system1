/*
 *ReservationRepository.java
 * VuyolwethuKalolo
 * 214015637
 * 06-04-2022
 */

package za.ac.cput.repository;



import za.ac.cput.entity.Owner;
import za.ac.cput.entity.Reservation;

import java.util.HashSet;
import java.util.Set;

public class ReservationRepository implements IReservationRepository {
    private static ReservationRepository repository = null;
    private Set<Reservation> reservationDB = null;

    private ReservationRepository() {
        reservationDB = new HashSet<>();

    }

    public static ReservationRepository getRepository() {
        if (repository == null) {
            repository = new ReservationRepository();
        }
        return repository;
    }


    @Override
    public Reservation create(Reservation reservation) {
        boolean success= reservationDB.add(reservation);
        if (!success)
            return null;
        return reservation;

    }

    @Override
    public Reservation read(String reserveId) {
        Reservation reserve=reservationDB.stream()
                .filter(e-> e.getReserveName().equals(reserveId))
                .findAny()
                .orElse(null);
        return reserve;
    }

    @Override
    public Reservation update(Reservation reservation) {
        Reservation ireserve=read(reservation.getReserveName());
        if(ireserve !=null){

            reservationDB.remove(ireserve);
            reservationDB.add(ireserve);
            return reservation;
        }
        return null;
    }

    @Override
    public boolean delete(String reserveId) {
        Reservation reservationToDelete= read(reserveId);
        if (reservationToDelete == null)
            return false;
        reservationDB.remove(reservationToDelete);
        return true;
    }

    @Override
    public Set<Reservation> getAll() {
        return null;
    }
}
