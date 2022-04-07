/* Restaurant.java
   Entity for the Restaurant
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 29 March 2022
 */
package za.ac.cput.entity;

public class Restaurant {
    private int restId;
    private String restName;
    private String restAddress;

    // private constructor required
    private Restaurant (Builder builder){
        this.restId = builder.restId;
        this.restName = builder.restName;
        this.restAddress = builder.restAddress;

    }


    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restId=" + restId +
                ", restName='" + restName + '\'' +
                ", restAddress='" + restAddress + '\'' +
                '}';
    }

    public static class Builder{

        private int restId;
        private String restName;
        private String restAddress;

        public Builder setRestId(int restId) {
            this.restId = restId;
            return this;
        }

        public Builder setRestName(String restName) {
            this.restName = restName;
            return this;
        }

        public Builder setRestAddress(String restAddress) {
            this.restAddress = restAddress;
            return this;
        }

        public Builder copy(Restaurant restaurant){
            this.restId = restaurant.restId;
            this.restName = restaurant.restName;
            this.restAddress = restaurant.restAddress;
            return this;
        }
        public Restaurant build(){
            return new Restaurant(this);
        }
    }

}
