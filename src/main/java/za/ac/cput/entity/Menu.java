/**
 * Menu.java
 * Menu entity for Restaurant System using Builder Pattern 
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 06 April 2022
 */

package za.ac.cput.entity;

public class Menu {

    private int menuId;
    private String menuItem;

    //private constructor
    private Menu(Builder builder) {
        this.menuId = builder.menuId;
        this.menuItem = builder.menuItem;
    }

    //Getters
    public int getMenuId() {
        return menuId;
    }

    public String getMenuItem() {
        return menuItem;
    }

    //Setters
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    //toString
    @Override
    public String toString() {
        return "Menu{" +
                ", menuId=" + menuId + '\'' +
                ", menuItem=" + menuItem + '\'' +
                '}';
    }

    //Builder Pattern Class
    public static class Builder {
        private int menuId;
        private String menuItem;

        public Builder setMenuId(int menuId) {
            this.menuId = menuId;
            return this;
        }

        public Builder setMenuItem(String menuItem) {
            this.menuItem = menuItem;
            return this;
        }

        public Builder copy(Menu menu) {
            this.menuId = menu.menuId;
            this.menuItem = menu.menuItem;
            return this;
        }

        public Menu build() {
            return new Menu(this);
        }
    }
}