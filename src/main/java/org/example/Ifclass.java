package org.example;

public class Ifclass {

    public static void main(String[] args) {
        int x = 5;

        // short circuiting:
        // Initially java checks the first condition if it is true it won't consider the second condition and give the final result

        if( x > 4 && x > 0 ){
            System.out.println(x);
        }
        else{
            System.out.println("nothing");
        }

        if (true)
            System.out.println("Java");
        else
            System.out.println("Kova");


        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Take an umbrella");
        } else {
            System.out.println("No need for an umbrella");
        }
    }

}
