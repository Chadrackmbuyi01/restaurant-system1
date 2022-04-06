package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Restaurant;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantFactoryTest {

    @Test
    public void test() {

        Restaurant restaurant = RestaurantFactory.createRestaurant(1001545,"Slug and Lettuce", " Liesbeek Parkway 625, Observatory");
        assertNotNull(restaurant);

    }
}