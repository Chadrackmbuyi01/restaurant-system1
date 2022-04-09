package za.ac.cput.repository;

import za.ac.cput.entity.Payment;

import java.util.Set;
import java.util.HashSet;

public class PaymentRepository implements IPaymentRepository{
    private static PaymentRepository paymentRepository = null;
    private Set<Payment> paymentDB = null;

    private PaymentRepository(){
        paymentDB = new HashSet<Payment>();
    }

    public static PaymentRepository getPaymentRepository(){
        if (paymentRepository == null){
            paymentRepository = new PaymentRepository();
        }
        return paymentRepository;
    }

    @Override
    public Payment create (Payment paymentId){
        boolean success = paymentDB.add(paymentId);
        if (!success)
            return null;
        return paymentId;
    }

    @Override
    public Payment read (String paymentId){
        Payment payment = paymentDB.stream()
                .filter(p -> p.getPaymentId().equals(p.getPaymentId()))
                .findAny()
                .orElse(null);
        return payment;
    }

    @Override
    public Payment update(Payment paymentId){
        Payment oldPaymentId = read(paymentId.getPaymentId());
        if (oldPaymentId != null){
            paymentDB.remove(oldPaymentId);
            paymentDB.add(paymentId);
            return paymentId;
        }
        return null;
    }

    @Override
    public boolean delete(String paymentId){
        Payment paymentIdToDelete = read((paymentId));
        if (paymentIdToDelete == null)
            return false;
        paymentDB.remove(paymentIdToDelete);
        return true;
    }

    @Override
    public Set<Payment> getAll(){
        return paymentDB;
    }
}


