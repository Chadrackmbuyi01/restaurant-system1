package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Owner;

import static org.junit.jupiter.api.Assertions.*;


class OwnerFactoryTest1 {
    @Test
    public void test(){

        Owner owner =OwnerFactory.createOwner(9425628,"John");
        assertNotNull(owner);
    }
    @Test
    void testEquality(){


    }
}
