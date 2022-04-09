/**
 * MenuRepositoryTest.java
 * Menu Repository Test for Menu Repository in Restaurant System
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 09 April 2022
 */

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Menu;
import za.ac.cput.factory.MenuFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class MenuRepositoryTest {

    private static MenuRepository menuRepository = MenuRepository.getMenuRepository();
    private static Menu menu = MenuFactory.createMenu("20", "Steak");

    //adding create method
    @Test
    void a_create() {
        Menu create = menuRepository.create(menu);
        assertEquals(menu.getMenuId(), create.getMenuId());
        System.out.println("Create: "+ create);
    }

    //adding read method
    @Test
    void b_read() {
        Menu read = menuRepository.read(menu.getMenuId());
        assertNotNull(read);
        System.out.println("Read:"+ read);
    }

    //adding update method
    @Test
    void c_update() {
        Menu update = new Menu.Builder().copy(menu).setMenuId("50").setMenuItem("Fish")
                .build();
        System.out.println("Update:"+ update);
    }

    //adding delete method
    @Test
    void e_delete() {
        boolean success = menuRepository.delete(menu.getMenuId());
        assertTrue(success);
        System.out.println("Has been deleted :"+ success);
    }

    //adding get all method
    @Test
    void d_getAll() {
        System.out.println( menuRepository.getAll());
        System.out.println("Show all :");
    }
}
