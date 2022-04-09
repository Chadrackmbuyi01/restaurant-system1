package za.ac.cput.factory;



import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Reservation;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFactoryTest {


    @Test
    public void test() {

        Reservation reservation = ReservationFactory.createReservation(9425628, "Aphiwe");
        assertNotNull(reservation);
    }
}



