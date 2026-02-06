package org.example;


import java.net.SocketException;

/*
  Basics: 1.syntax, variables, operators,  main 
	2.	Control flow: if/else, loops
	3.	Methods: parameters, return types
	4.	Classes/objects & constructors
	5.	Inheritance, interfaces (just enough for base classes)
	6.	Arrays and  List / ArrayList 
	7.	Strings and common methods
	8.	Exceptions ( try/catch/finally )
	9.	Simple file reading (if needed)
	10.	Maven + TestNG basics
 */
public class ExceptionHandling {

    public static void main1(String[] args) {

        int result = 10 / 0;
        System.out.println("Result: " + result);

    }

    public static void main12(String[] args) {

        try {
            // Code that might fail (Selenium actions)
            int result = 10 / 0;  // This throws ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the specific exception
            System.out.println("Error: Division by zero!");
        }
        System.out.println("Test continues...");

    }

    public static void main(String[] args) {

        try {
            // call orange bus
            // receive orange bus response
            //if bus available boo otherwise send no bus available
            throw new SocketException();
        } catch (SocketException e) {
            // Sorry for the inconevenience
        }
        System.out.println("Test continues...");

    }











}
