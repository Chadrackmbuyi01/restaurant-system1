/**
 * IPaymentRepository.java
 * Payment Repository Interface for Payment Repository in Restaurant System
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 09 April 2022
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Payment;
import java.util.Set;

public interface IPaymentRepository extends IRepository <Payment, String>{
    public Set<Payment> getAll();
}
