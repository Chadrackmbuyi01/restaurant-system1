/*
Delivery.java
Entity for delivery using builder pattern
Author : Zubair Esau (217100554)
Date 05 April 2022

 */

package za.ac.cput.entity;




public class Delivery {
    private int DeliveryId ;
    private int OrderId ;

    // private constructor
    private Delivery (Builder builder){
        this.DeliveryId = builder.DeliveryId;
        this.OrderId = builder.OrderId;
    }


    //Getters and setters


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

    //Builder pattern class
    public static class Builder{
        private int DeliveryId ;
        private int OrderId ;


        public Builder setDeliveryId(int deliveryId) {
            this.DeliveryId = deliveryId;
            return this;
        }

        public Builder setOrderId(int orderId) {
            this.OrderId = orderId;
            return this;
        }


        public Builder copy(Delivery delivery){
            this.DeliveryId = DeliveryId;
            this.OrderId = OrderId;
            return this;
        }

        public Delivery build(){
            return new Delivery(this);
        }

    }

}


