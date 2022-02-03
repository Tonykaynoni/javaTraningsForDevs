package com.anola;

public class SittingRoom {
    //global scope variable
    boolean light;

    // constructor is the first method to be executed when
    // a class is called or instantiated
    public SittingRoom(String username, boolean isLight){
        light  = isLight;
        System.out.println("Welcome " + username);
    }

    public void tv(){
        if(light == true){
            System.out.println("Tv is on");
        }else{
            System.out.println("Tv is off");
        }
    }

    public void bulb(){
        if(light == true){
            System.out.println("Bulb is on");
        }else{
            System.out.println("Bulb is off");
        }
    }

    public int addNum(int a, int b){
        int c = a + b;
       return  c;
    }
}
