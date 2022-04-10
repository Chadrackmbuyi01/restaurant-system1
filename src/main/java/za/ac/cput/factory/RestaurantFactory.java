/* RestaurantFactory.java
   Restaurant Factory for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 05 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Employee;
import za.ac.cput.entity.Restaurant;
import za.ac.cput.util.Helper;

public class RestaurantFactory {

    public static Restaurant createRestaurant(String restName, String restAddress) {
        String restId = Helper.generatedId();
        Restaurant restaurant = new Restaurant.Builder().setRestRegNumber(restId)
                .setRestName(restName)
                .setRestAddress(restAddress)
                .build();
        return restaurant;
    }
}
