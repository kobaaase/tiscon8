package com.tiscon.dto;

public class PriceDto {

    private Integer totalPrice;

    private Integer priceForDistance;

    private Integer pricePerTruck;

    private Integer priceForOptionalService;

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    } 

    public Integer getPriceForDistance() {
        return priceForDistance;
    }

    public void setPriceForDistance(Integer priceForDistance) {
        this.priceForDistance = priceForDistance;
    } 

    public Integer getPricePerTruck() {
        return pricePerTruck;
    }

    public void setPricePerTruck(Integer pricePerTruck) {
        this.pricePerTruck = pricePerTruck;
    } 

    public Integer getPriceForOptionalService() {
        return priceForOptionalService;
    }

    public void setPriceForOptionalService(Integer priceForOptionalService) {
        this.priceForOptionalService = priceForOptionalService;
    } 
    
}
