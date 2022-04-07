package za.ac.cput.factory;

import za.ac.cput.entity.Payment;

public class PaymentFactory {
    public static Payment createPayment(String paymentId, String payCash, String payCard, String payEft) {
        return new Payment.Builder().setPaymentId(Integer.parseInt(paymentId))
                .setPayCash(payCash)
                .setPayCard(payCard)
                .setPayEft(payEft)
                .build();
    }
}
