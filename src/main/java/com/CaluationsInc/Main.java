package com.CaluationsInc;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Enter the first number: 5
//        Enter the second number: 12
//        Possible calculations:
//        (A)dd
//                (S)ubtract
//                (M)ultiply
//                (D)ivide
//        Please select an option: M

        Scanner number = new Scanner(System.in);

        System.out.print(" Input number 5 here: ");
        int num1 = number.nextInt();
        System.out.print(" Input number 10 here: ");
        int num2 = number.nextInt();

        number.nextLine();

        System.out.print(" Chose Math Operation A,S,M,D : ");
       String choice = number.nextLine();

        int result = 0;

        if (choice.equalsIgnoreCase("A")) {result = num1 + num2;
            System.out.print(" The result is: : " + result);}

        else if (choice.equalsIgnoreCase("S")) { result = num1 - num2;
            System.out.print(" The result is: : " + result);}

        else if (choice.equalsIgnoreCase("M")) {result = num1 * num2;
        System.out.print(" The result is: : " + result);}

        else if (choice.equalsIgnoreCase("D")) {result = num1 / num2;
        System.out.print(" The result is: : " + result);}

        else  {System.out.println("Invalid choice.");}










        }
    }
