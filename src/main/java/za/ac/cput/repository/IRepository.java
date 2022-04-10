/*
 *ReservationRepository.java
 * VuyolwethuKalolo
 * 214015637
 * 06-04-2022
 */


package za.ac.cput.repository;

public interface IRepository <T,ID>{
    T create(T t);
    T read(ID id );
   T  update(T  t);
    boolean delete(ID id);
}
