/**
 * MenuFactoryTest.java
 * Menu Factory Test for Menu Factory in Restaurant System
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 07 April 2022
 */

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
