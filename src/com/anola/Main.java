package com.anola;

public class Main {

    public static void main(String[] args) {
	        // write your code here

            //Instance of a class (Object)
            SittingRoom m = new SittingRoom("Tonykay", true); // passing a parameter into a constructor

           // m.light = false; // accessing object parameter.
            m.bulb(); // accessing object method.

            System.out.println();
            //Object 2 == m2
            SittingRoom m2 = new SittingRoom("Sammy", false); // passing a parameter into a constructor

           // m2.light = true; // accessing object parameter.
            m2.bulb(); // accessing object method.

            System.out.println();
            UsingMap myMap = new UsingMap();
            myMap.showA();


    }
}
