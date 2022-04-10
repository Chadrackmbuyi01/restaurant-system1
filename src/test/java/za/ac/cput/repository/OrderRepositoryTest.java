/* OrderRepositoryTest.java
   Order Repository Test
   Author: Ismail Watara
   Student Number: 219018790
   Date: April 2022
*/

package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Order;
import za.ac.cput.factory.OrderFactory;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    private static OrderRepository repository = OrderRepository.getRepository();
    private static Order order = OrderFactory.createorder(
            "537WI",
            "Fanta");


    @Test
    void a_create() {
        Order created = repository.create(order);
        assertEquals(created.getOrderId(), order.getOrderId());
        System.out.println("Created:" + created);
    }

    @Test
    void b_read() {
        Order read = repository.read(order.getOrderId());
        System.out.println("Read:" + read);

    }

    @Test
    void c_update() {
        Order update = new Order.Builder().copy(order)
                .setorderItem("Kithcen") //change to something else
                .build();
        assertEquals(update.getOrderId(), order.getOrderId());
        System.out.println("Updated order" + update);

    }

    @Test
    void d_delete() {
        repository.delete(order.getOrderId());
        assertNotNull(repository);
    }

    @Test
    void e_getAll() {
        System.out.println("Order: \n" + repository.getAll());
    }
}