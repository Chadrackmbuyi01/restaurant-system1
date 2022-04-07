/*
Driver.java
Entity for driver using builder pattern
Author : Zubair Esau (217100554)
Date 05 April 2022

 */
package za.ac.cput.entity;


public class Driver {
    private Integer DriverId ;
    private Integer DeliveryId ;
    private Integer OrderId ;
    private String DriverName;

    //private constructor
    private Driver(Builder builder){
        this.DriverId = builder.DriverId;
        this.DeliveryId = builder.DeliveryId;
        this.OrderId = builder.OrderId;
        this.DriverName = builder.DriverName;
    }

    // Getters and setters


    public Integer getDriverId() {
        return DriverId;
    }

    public void setDriverId(Integer driverId) {
        DriverId = driverId;
    }

    public Integer getDeliveryId() {
        return DeliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        DeliveryId = deliveryId;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer orderId) {
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
        private Integer DriverId ;
        private Integer DeliveryId ;
        private Integer OrderId ;
        private String DriverName;

        public Builder setDriverId(Integer driverId) {
            DriverId = driverId;
            return this;
        }

        public Builder setDeliveryId(Integer deliveryId) {
            DeliveryId = deliveryId;
            return this;
        }

        public Builder setOrderId(Integer orderId) {
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

