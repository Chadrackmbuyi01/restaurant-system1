package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Driver;

import static org.junit.jupiter.api.Assertions.*;

class DriverFactoryTest {

    @Test
    public void test(){
        Driver driver = DriverFactory.createDriver("23475","67","Zubairy");
        assertNotNull(driver);

    }

}