/* Customer.java
   Factory Test for Order
   Author: Ismail Watara
   Student Number: 219018790
   Date: March 2022
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Order;

import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {

    @Test
    public void test(){

        Order order = OrderFactory.createorder(
                "537WI",
                "Fanta");


        System.out.println(order.toString());
        assertNotNull(order);
    }

}