/**
 * MenuFactory.java
 * Menu Factory for Menu Entity in Restaurant System
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 07 April 2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Menu;

public class MenuFactory {
    public static Menu createMenu(String menuId, String menuItem) {
        return new Menu.Builder().setMenuId(Integer.parseInt(menuId))
                .setMenuItem(menuItem)
                .build();
    }

}
