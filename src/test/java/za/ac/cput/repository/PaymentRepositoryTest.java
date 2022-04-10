/**
 * PaymentRepositoryTest.java
 * Payment Repository Test for Payment Repository in Restaurant System
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 09 April 2022
 */

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class PaymentRepositoryTest {

    private static PaymentRepository paymentRepository = PaymentRepository.getPaymentRepository();
    private static Payment payment = PaymentFactory.createPayment("325", "yes", "no", "no");

    //adding create method
    @Test
    void a_create() {
        Payment create = paymentRepository.create(payment);
        assertEquals(payment.getPaymentId(), create.getPaymentId());
        System.out.println("Create: "+ create);
    }

    //adding read method
    @Test
    void b_read() {
        Payment read = paymentRepository.read(payment.getPaymentId());
        assertNotNull(read);
        System.out.println("Read:"+ read);
    }

    //adding update method
    @Test
    void c_update() {
        Payment update = new Payment.Builder().copy(payment).setPaymentId("76").setPayCash("R700.00").setPayCard("R0.00").setPayEft("R0.00")
                .build();
        System.out.println("Update:"+ update);
    }

    //adding delete method
    @Test
    void e_delete() {
        boolean success = paymentRepository.delete(payment.getPaymentId());
        assertTrue(success);
        System.out.println("Has been deleted :"+ success);
    }

    //adding get all method
    @Test
    void d_getAll() {
        System.out.println( paymentRepository.getAll());
        System.out.println("Show all :");
    }
}


