/* RestaurantFactoryTest.java
   Restaurant Test Factory for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 05 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Restaurant;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantFactoryTest {

    @Test
    public void test() {

        Restaurant restaurant = RestaurantFactory.createRestaurant("Slug and Lettuce","Liesbeek Parkway 625, Observatory");
        assertNotNull(restaurant);
        System.out.println(restaurant);

    }
}