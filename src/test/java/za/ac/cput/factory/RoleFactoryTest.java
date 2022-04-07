/* RoleFactoryTest.java
   RoleFactoryTest for Restaurant system
   Author: Marcia Zanele Bika (211054356)
   Date: 07 April 2022
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Role;

import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest {

    @Test
    public void test(){
        Role role = RoleFactory.createRole(211, "Manager");
        assertNotNull(role);
    }

}