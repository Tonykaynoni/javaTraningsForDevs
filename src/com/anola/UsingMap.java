package com.anola;
import java.util.HashMap;
import java.util.Map;

public class UsingMap {
    // global variable
   Map<String, Boolean> store;

    //constructor
    public UsingMap(){
        //using a method to assign value to a global variable
        addItemsToStore();
    }

    public void addItemsToStore(){
        // assigning value to store
        store  = new HashMap<String, Boolean>();
        store.put("AppleWatch", true);
        store.put("Tv", true);
        store.put("Game", true);
        store.put("Fan", false);
        store.put("Chair", false);
        store.put("Beans", true);

    }

    public void checkProduct(String productName){
        if(productName == "AppleWatch" && store.get("AppleWatch") == true){
            System.out.println("AppleWatch is available");
            return;
        }

        if(productName == "Tv" && store.get("Tv") == true){
            System.out.println("Tv is available");
            return;
        }

        if(productName == "Beans" && store.get("Beans") == true){
            System.out.println("Beans is available");
            return;
        }

        if(productName == "Game" && store.get("Game") == true){
            System.out.println("Game is available");
            return;
        }

        if(productName == "Fan" && store.get("Fan") == true){
            System.out.println("Fan is available");
            return;
        }

        if(productName == "Chair" && store.get("Chair") == true){
            System.out.println("Chair is available");
            return;
        }else{
            System.out.println(productName + " is not available");
        }


    }

    public void advanceCheck(String productName){
        if(!store.containsKey(productName)){
            System.out.println(productName + " is not available");
        }else if(store.containsKey(productName) && store.get(productName) == true){
            System.out.println(productName + " is available");
        }else{
            System.out.println(productName + " is out of stock");
        }


    }


}
