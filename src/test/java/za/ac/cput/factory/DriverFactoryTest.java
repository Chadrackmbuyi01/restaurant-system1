/*
DeliveryFactoryTest.java
Test class for Delivery Factory
Author : Zubair Esau (217100554)
Date 06 April 2022

 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Driver;

import static org.junit.jupiter.api.Assertions.*;

class DriverFactoryTest {

    @Test
    public void test(){
        Driver driver = DriverFactory.createDriver("23T","67E","Zubairy");
        assertNotNull(driver);

    }

}