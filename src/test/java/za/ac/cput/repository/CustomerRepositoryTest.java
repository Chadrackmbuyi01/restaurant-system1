/* CustomerRepositoryTest.java
   Customer Repository Test
   Author: Ismail Watara
   Student Number: 219018790
   Date: April 2022
*/

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)


class CustomerRepositoryTest {

    private static CustomerRepository repository = CustomerRepository.getRepository();
    private static Customer customer = CustomerFactory.createcustomer(
            "21856WI",
            "Jeffery",
            "Wathers",
            822596498,
            "2185690870@mycput.ac.za");

    @Test
    void a_create() {
        Customer created = repository.create(customer);
        assertEquals(created.getCustId(), customer.getCustId());
        System.out.println("Created:"  + created);

    }

    @Test
    void b_read() {
        Customer read = repository.read(customer.getCustId());
        System.out.println("Read:" + read);
    }

    @Test
    void c_update() {
        Customer update = new Customer.Builder().copy(customer)
                .setcustCellNum(160)
                .setCustId("21900DB")
                .build();
        //assertEquals(update.getCustId(),customer.getCustId());
        System.out.println("Updated customer: " + update) ;


    }

    @Test
    void d_delete() {
        repository.delete(customer.getCustId());
        assertNotNull(repository);
    }

    @Test
    void e_getAll() {
        System.out.println("Customers: \n " + repository.getAll());
    }
}