/*
Driver.java
Entity for driver using builder pattern
Author : Zubair Esau (217100554)
Date 05 April 2022

 */
package za.ac.cput.entity;


public class Driver {
    private int DriverId ;
    private int DeliveryId ;
    private int OrderId ;
    private String DriverName;

    //private constructor
    private Driver(Builder builder){
        this.DriverId = builder.DriverId;
        this.DeliveryId = builder.DeliveryId;
        this.OrderId = builder.OrderId;
        this.DriverName = builder.DriverName;
    }

    // Getters and setters


    public int getDriverId() {
        return DriverId;
    }

    public void setDriverId(int driverId) {
        DriverId = driverId;
    }

    public int getDeliveryId() {
        return DeliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        DeliveryId = deliveryId;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "DriverId=" + DriverId +
                ", DeliveryId=" + DeliveryId +
                ", OrderId=" + OrderId +
                ", DriverName='" + DriverName + '\'' +
                '}';
    }

    //Builder pattern class
    public static class Builder {
        private int DriverId ;
        private int DeliveryId ;
        private int OrderId ;
        private String DriverName;

        public Builder setDriverId(int driverId) {
            this.DriverId = driverId;
            return this;
        }

        public Builder setDeliveryId(int deliveryId) {
            this.DeliveryId = deliveryId;
            return this;
        }

        public Builder setOrderId(int orderId) {
            this.OrderId = orderId;
            return this;
        }

        public Builder setDriverName(String driverName) {
            DriverName = driverName;
            return this;
        }


        public Builder copy( Driver driver){
            this.DriverId = DriverId;
            this.DeliveryId = DeliveryId;
            this.OrderId = OrderId;
            this.DriverName = DriverName;
            return this;
        }


        public Driver build(){
            return new Driver(this);
        }



    }


}

