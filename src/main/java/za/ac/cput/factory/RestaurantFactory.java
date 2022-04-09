/* RestaurantFactory.java
   Restaurant Factory for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 05 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Employee;
import za.ac.cput.entity.Restaurant;

public class RestaurantFactory {

    public static Restaurant createRestaurant(int restId, String restName, String restAddress) {
        return new Restaurant.Builder().setRestId(restId)
                .setRestName(restName)
                .setRestAddress(restAddress)
                .build();
    }
}
