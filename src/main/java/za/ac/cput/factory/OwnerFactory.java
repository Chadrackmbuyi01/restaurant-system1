/*
 *OwnerFactory.java
 * VuyolwethuKalolo
 * 214015637
 * 06-04-2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Owner;

public class OwnerFactory {

    //creating objects
    public static Owner createOwner(int ownerId, String ownerName){

        return new Owner.Builder().setOwnwerId(ownerId)
                .setOwnerName(ownerName)
                .build();

    }
}
