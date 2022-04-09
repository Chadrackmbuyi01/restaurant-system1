/* Customer.java
   Factory Test for Customer
   Author: Ismail Watara
   Student Number: 219018790
   Date: March 2022
*/




package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    public void test() {

        Customer customer = CustomerFactory.createcustomer(
                "21856WI",
                "Jeffery",
                "Wathers",
                822596498,
                "2185690870@mycput.ac.za");

        System.out.println(customer.toString());
        assertNotNull(customer);
    }
}
