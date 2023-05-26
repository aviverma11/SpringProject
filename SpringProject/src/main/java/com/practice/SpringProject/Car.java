package com.practice.SpringProject;

public class Car implements Vehicle {

    private DiscountService discountService;
    @Override
    public String getMileage() {
        return "the car mileage is 50km/l";
    }
    public String getDiscountMessage(){
        this.discountService.getDiscountMessage();
        return null;
    }
}
