/*
Delivery.java
Entity for delivery using builder pattern
Author : Zubair Esau (217100554)
Date 05 April 2022

 */

package za.ac.cput.entity;




public class Delivery {
    private Integer DeliveryId ;
    private Integer OrderId ;

    // private constructor
    private Delivery (Builder builder){
        this.DeliveryId = builder.DeliveryId;
        this.OrderId = builder.OrderId;
    }


    //Getters and setters


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

    @Override
    public String toString() {
        return "Delivery{" +
                "DeliveryId=" + DeliveryId +
                ", OrderId=" + OrderId +
                '}';
    }

    //Builder pattern class
    public static class Builder{
        private Integer DeliveryId ;
        private Integer OrderId ;


        public Builder setDeliveryId(Integer deliveryId) {
            DeliveryId = deliveryId;
            return this;
        }

        public Builder setOrderId(Integer orderId) {
            OrderId = orderId;
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


