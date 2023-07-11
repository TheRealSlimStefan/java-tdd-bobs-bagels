package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> bagels;
    private int basketCapacity;
    private int basketQuantity;

    public Basket(int basketCapacity) {
        this.basketCapacity = basketCapacity;
        this.bagels = new HashMap<>();
    }

    public boolean add(String bagel, int quantity) {
        if(basketQuantity + quantity > basketCapacity){
            System.out.println("There is no room for another bagel!");
            return false;
        } else {
            this.basketQuantity += quantity;

            if(this.bagels.containsKey(bagel)){
                int newQuantity = this.bagels.get(bagel) + quantity;
                this.bagels.put(bagel, newQuantity);
            } else {
                bagels.put(bagel, quantity);
            }

            return true;
        }
    }

    public HashMap<String, Integer> getBagels() {
        return bagels;
    }
}
