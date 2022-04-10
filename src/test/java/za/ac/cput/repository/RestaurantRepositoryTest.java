/* RestaurantRepositoryTest.java
   Restaurant Repository Test class for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 08 April 2022
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Employee;
import za.ac.cput.entity.Restaurant;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.RestaurantFactory;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantRepositoryTest {

    private static RestaurantRepository repo = RestaurantRepository.getRepo();
    private static Restaurant restaurant = RestaurantFactory.createRestaurant("The Riverclub", "3 London street, ManUnited");

    @Test
    void a_create(){
        Restaurant created = repo.create(restaurant);
        assertEquals(restaurant.getRestRegNumber(), created.getRestRegNumber());
        System.out.println("Create: " + created);

    }

    @Test
    void b_read(){
        Restaurant read = repo.read(restaurant.getRestRegNumber());
        assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void c_update(){
        Restaurant updated = new Restaurant.Builder().copy(restaurant).setRestName("The Players")
                .setRestAddress("312 Main Road, Claremont")
                .build();
        assertNull(repo.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete(){
        boolean success = repo.delete(restaurant.getRestRegNumber());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(repo.getAll());

    }


}