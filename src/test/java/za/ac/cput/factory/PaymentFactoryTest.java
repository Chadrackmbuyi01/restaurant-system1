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
