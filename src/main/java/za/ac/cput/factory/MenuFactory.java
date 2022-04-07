package za.ac.cput.factory;

import za.ac.cput.entity.Menu;

import java.util.UUID;

public class MenuFactory {
    public static Menu createMenu(String menuId, String menuItem) {
        return new Menu.Builder().setMenuId(Integer.parseInt(menuId))
                .setMenuItem(menuItem)
                .build();
    }

}
