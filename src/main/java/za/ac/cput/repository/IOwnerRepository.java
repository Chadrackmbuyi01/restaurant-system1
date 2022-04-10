/*
 *RIOwnerRepository.java
 * VuyolwethuKalolo
 * 214015637
 * 06-04-2022
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Owner;

import java.util.Set;

public interface IOwnerRepository  extends IRepository<Owner,String>{
public Set<Owner> getAll();

}
