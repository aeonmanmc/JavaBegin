package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(111);
        nums1.add(222);
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(333);
        nums2.add(444);

        Customer c1 = new Customer(1, nums1);
        Customer c2 = new Customer(2, nums2);
        List<Customer> customers =  new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.stream().flatMap(i -> i.getNums().stream()).forEachOrdered(System.out::println);


    }
}
