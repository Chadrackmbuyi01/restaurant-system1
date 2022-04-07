package za.ac.cput.factory;



import za.ac.cput.entity.Reservation;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFactoryTest {
    class ReserveFactoryTest {
        class OwnerFactoryTest {
            @Test
            public void test(){

                Reservation reservation =ReserveFactory.createOwner(9425628,"Aphiwe");
                assertNotNull(owner);
            }

        }

}