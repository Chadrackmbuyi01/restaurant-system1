/*
DeliveryRepositoryTest.java
Test class for DeliveryRepository, testing CRUD methods
Author : Zubair Esau (217100554)
Date 07 April 2022

 */

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Delivery;
import za.ac.cput.factory.DeliveryFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DeliveryRepositoryTest {

    private static DeliveryRepository repos = DeliveryRepository.getRepo();
    private static Delivery delivery = DeliveryFactory.createDelivery("007J","915B");


    @Test
    void a_create() {

        Delivery created = repos.create(delivery);
        assertEquals(delivery.getDeliveryId(), created.getDeliveryId());
        System.out.println("Create:"+ created);

    }

    @Test
    void b_read() {
        Delivery read = repos.read(delivery.getDeliveryId());
        assertNotNull(read);
        System.out.println("Read:"+ read);
    }

    @Test
    void c_update() {

        Delivery updated = new Delivery.Builder().copy(delivery).setDeliveryId("464r").setOrderId("54743g")
                .build();
        // assertNotNull(repos.update(updated));
        System.out.println("Update:"+ updated);

    }

    @Test
    void e_delete() {

        boolean success = repos.delete(delivery.getDeliveryId());
        assertTrue(success);
        System.out.println("Has been deleted :"+ success);

    }

    @Test
    void d_getAll() {

        System.out.println( repos.getAll());
        System.out.println("Show all :");


    }
}

