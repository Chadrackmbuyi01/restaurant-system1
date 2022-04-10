/*
 *OwnerFactoryTest,java
 *  VuyolwethuKalolo
 * 214015637
 * 06-04-2022
 */
package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Owner;

import static org.junit.jupiter.api.Assertions.*;


class OwnerFactoryTest {
        @Test
        public void test(){

            Owner owner =OwnerFactory.createOwner(9425628,"Aphiwe");
            assertNotNull(owner);
        }

    }
