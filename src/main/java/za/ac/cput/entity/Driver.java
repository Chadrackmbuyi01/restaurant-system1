/*
Driver.java
Entity for driver using builder pattern
Author : Zubair Esau (217100554)
Date 05 April 2022

 */
package za.ac.cput.entity;


public class Driver {
    private String DriverId ;
    private String DeliveryId ;
    private String OrderId ;
    private String DriverName;

    //private constructor
    Driver(Builder builder){
        this.DriverId = builder.DriverId;
        this.DeliveryId = builder.DeliveryId;
        this.OrderId = builder.OrderId;
        this.DriverName = builder.DriverName;
    }

    public Driver() {

    }

    // Getters and setters


    public String getDriverId() {
        return DriverId;
    }

    public void setDriverId(String driverId) {
        DriverId = driverId;
    }

    public String getDeliveryId() {
        return DeliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        DeliveryId = deliveryId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    //To String


    @Override
    public String toString() {
        return "Driver{" +
                "DriverId='" + DriverId + '\'' +
                ", DeliveryId='" + DeliveryId + '\'' +
                ", OrderId='" + OrderId + '\'' +
                ", DriverName='" + DriverName + '\'' +
                '}';
    }

    //Builder pattern class
    public static class Builder {
        private String DriverId ;
        private String DeliveryId ;
        private String OrderId ;
        private String DriverName;

        public Builder setDriverId(String driverId) {
            DriverId = driverId;
            return this;
        }

        public Builder setDeliveryId(String deliveryId) {
            DeliveryId = deliveryId;
            return this;
        }

        public Builder setOrderId(String orderId) {
            OrderId = orderId;
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

