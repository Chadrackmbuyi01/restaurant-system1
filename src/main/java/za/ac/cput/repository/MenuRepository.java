package za.ac.cput.repository;

import za.ac.cput.entity.Menu;

import java.util.HashSet;
import java.util.Set;

public class MenuRepository implements IMenuRepository{

    private static MenuRepository menuRepository = null;
    private Set<Menu> menuDB = null;

    private MenuRepository(){
        menuDB = new HashSet<Menu>();
    }
    public static MenuRepository getMenuRepository(){
        if (menuRepository == null){
            menuRepository = new MenuRepository();
        }
        return menuRepository;
    }

    @Override
    public Menu create (Menu menuItem){
        boolean success = menuDB.add(menuItem);
        if (!success)
            return null;
        return menuItem;
    }

    @Override
    public Menu read (String menuId){
        Menu menu = menuDB.stream()
                .filter(m -> m.getMenuItem().equals(m.getMenuItem()))
                .findAny()
                .orElse(null);
        return menu;
    }

    @Override
    public Menu update(Menu menuItem){
        Menu oldMenuItem = read(menuItem.getMenuItem());
        if (oldMenuItem != null){
            menuDB.remove(oldMenuItem);
            menuDB.add(menuItem);
            return menuItem;
        }
        return null;
    }

    @Override
    public boolean delete(String menuItem){
        Menu menuItemToDelete = read((menuItem));
        if (menuItemToDelete == null)
            return false;
        menuDB.remove(menuItemToDelete);
        return true;
    }
    @Override
    public Set<Menu> getAll(){
        return menuDB;
    }
}