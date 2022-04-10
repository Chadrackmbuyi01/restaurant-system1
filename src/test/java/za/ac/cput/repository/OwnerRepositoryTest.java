package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Owner;
import za.ac.cput.factory.OwnerFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class OwnerRepositoryTest {
private static OwnerRepository repos= OwnerRepository.getRepository();
private static Owner owner= OwnerFactory.createOwner(112345,"Aphiwe");

    @Test
    void a_create() {
       Owner created= repos .create(owner);
       assertEquals(owner.getOwnerId(),created.getOwnerId());
        System.out.println("created :"  + created);
    }

    @Test
    void b_read() {
        Owner read= repos .read(owner.getOwnerName());
        assertNotNull(read);
        System.out.println("Read:"  + read);
    }

    @Test
    void c_update() {
        Owner updated = new Owner.Builder().copy(owner).setOwnerName("Glan")
                .setOwnwerId(12346)
                .build();
        assertNotNull(repos.update(updated));
        System.out.println("Updated" +updated);
    }


    @Test
    void d_delete() {
      boolean success= repos.delete(owner.getOwnerName());
      assertTrue(success);
       System.out.println("Deleted" + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all :" );
        System.out.println(repos.getAll());
    }
}