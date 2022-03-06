package com.company;

import java.util.List;

public class Customer {

    private int id;

    public int getId() {
        return id;
    }

    public List<Integer> getNums() {
        return nums;
    }

    private List<Integer> nums;

    public Customer(int id, List<Integer> nums) {
        this.id = id;
        this.nums = nums;
    }
}
