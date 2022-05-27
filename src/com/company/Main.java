package com.company;



public class Main {

    public static void main(String[] args) {

        try{
            Car.close();
            throw new Car();

        }catch (Car e){
            e.drive();
        }
    }


}

