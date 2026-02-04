package org.example;

import java.sql.SQLOutput;

public class SwitchClass {


    public static void main(String[] args) {
        String visa = "H1B";

        if (visa.equals("H1B")) {
            System.out.println("Please pay a fine of $500");
        }

        else if (visa.equals("OPT")) {
            System.out.println("Please pay a fine of $300");
        }

        else if (visa.equals("F1")) {
            System.out.println("Please pay a fine of $100");
        }

        else if (visa.equals("GC")) {
            System.out.println("Please pay a fine of $2000");
        }

        else {
            System.out.println("Give proper visa details");
        }

    }
// switch has to eb
    public static void main1(String[] args) {
        String visa = "H1B";

        switch (visa){
            case "H1B":
                System.out.println("Please pay a fine of $500");
                break;
            case "OPT":
                System.out.println("Please pay a fine of $300");
                break;
            case "F1":
                System.out.println("Please pay a fine of $100");
                break;
            case "GC":
                System.out.println("Please pay a fine of $2000");
                break;
            default:
                System.out.println("Give proper visa details");

        }

    }


}
