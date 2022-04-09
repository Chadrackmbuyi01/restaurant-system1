package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Delivery;


import static org.junit.jupiter.api.Assertions.*;

class DeliveryFactoryTest {


    @Test
    public void test(){
        Delivery delivery = DeliveryFactory.createDelivery("89Y","8P");
        assertNotNull(delivery);

    }


}