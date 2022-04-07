/**
 * PaymentFactoryTest.java
 * Payment Factory Test for Payment Factory in Restaurant System
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 07 April 2022
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payment;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentFactoryTest {

    @Test
    public void test() {
        Payment payment = PaymentFactory.createPayment("350", "yes", "no", "no");
        assertNotNull(payment);
    }
}
