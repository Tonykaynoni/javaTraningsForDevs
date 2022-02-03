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

    }



}
