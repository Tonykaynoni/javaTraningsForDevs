package com.anola;

public class PassingValToContructor {
    int a;

    //constructor
    public PassingValToContructor(){
        //using a method to assign value to a global variable
        addItemsToStore();
    }

    public void addItemsToStore(){
        // assigning value to a
        a = 2;
    }

    public void showA(){
        //display a`
        System.out.println("A =" + a);
    }
}
