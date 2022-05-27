package com.company;



public class Car extends RuntimeException {
    public static void close(){
        System.out.println("Mashina jabylyp jatat");
    }
    public void drive(){
        System.out.println("Mashina jurup jatat");
    }

}
