package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Menu;

import static org.junit.jupiter.api.Assertions.*;

public class MenuFactoryTest {

    @Test
    public void test() {
        Menu menu = MenuFactory.createMenu("52", "Chips");
        assertNotNull(menu);
    }


}
