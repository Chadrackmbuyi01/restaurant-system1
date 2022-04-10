package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Owner;
import za.ac.cput.entity.Reservation;
import za.ac.cput.factory.OwnerFactory;
import za.ac.cput.factory.ReservationFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ReservationRepositoryTest {
    private static ReservationRepository repos= ReservationRepository .getRepository();
    private static  Reservation  reservation= ReservationFactory.createReservation(112345,"Aphiwe");

    @Test
    void a_create() {
        Reservation created= repos .create(reservation);
        assertEquals(reservation.getReserveId(),created.getReserveId());
        System.out.println("created :"  + created);
    }

    @Test
    void b_read() {
        Reservation read= repos .read(reservation.getReserveName());
        assertNotNull(read);
        System.out.println("Read:"  + read);
    }

    @Test
    void  c_update() {
        Reservation updated = new Reservation.Builder().copy(reservation).setReserveName("Mike")
                .setReserveId(33457)
                .build();
        assertNotNull(repos.update(updated));
        System.out.println("Updated" +updated);
    }

    @Test
    void d_delete() {
        boolean success= repos.delete(reservation.getReserveName());
        assertTrue(success);
        System.out.println("Deleted" + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all :" );
    }
}