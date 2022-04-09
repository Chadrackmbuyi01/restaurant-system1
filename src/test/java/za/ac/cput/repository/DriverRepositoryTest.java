/*
DriverRepositoryTest.java
Test class for DriverRepository, testing CRUD methods
Author : Zubair Esau (217100554)
Date 07 April 2022

 */


package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Driver;
import za.ac.cput.factory.DriverFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class   DriverRepoTest {

    private static DriverRepository repo = DriverRepository.getRepo();
    private static Driver driver = DriverFactory.createDriver("65Q","3E","Bob");




    @Test
    void a_create() {

        Driver created = repo.create(driver);
        assertEquals(driver.getDriverId(), created.getDriverId());
        System.out.println("Create:"+ created);

    }

    @Test
    void b_read() {
        Driver read = repo.read(driver.getDriverId());
        assertNotNull(read);
        System.out.println("Read:"+ read);
    }

    @Test
    void c_update() {

        Driver updated = new Driver.Builder().copy(driver).setDriverName("Steve").setDriverId("3421CA")
                .build();
        assertNotNull(repo.update(updated));
        System.out.println("Update:"+ updated);

    }

    @Test
    void e_delete() {

        boolean success = repo.delete(driver.getDriverId());
        assertTrue(success);
        System.out.println("Has been deleted :"+ success);

    }

    @Test
    void d_getAll() {

        System.out.println( repo.getAll());
        System.out.println("Show all :");


    }
}
