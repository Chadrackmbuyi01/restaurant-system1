/*
 *IReservationRepository.java
 * VuyolwethuKalolo
 * 214015637
 * 06-04-2022
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Reservation;

import java.util.Set;

public interface IReservationRepository extends IRepository<Reservation,String>{
public Set<Reservation> getAll();
}
