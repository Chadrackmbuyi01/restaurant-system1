package za.ac.cput.repository;

import za.ac.cput.entity.Menu;

import java.util.Set;

public interface IMenuRepository extends IRepository <Menu, String> {
    public Set<Menu> getAll();
}
