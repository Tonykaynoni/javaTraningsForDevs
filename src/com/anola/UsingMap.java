package com.anola;
import java.util.HashMap;
import java.util.Map;

public class UsingMap {
    // global variable
    int a;

    //constructor
    public UsingMap(){
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
