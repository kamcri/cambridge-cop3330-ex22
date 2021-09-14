/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();

        int largestNum;
        if(num1 >= num2 && num1 >= num3)
        {
            largestNum = num1;
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            largestNum = num2;
        }
        else
        {
            largestNum = num3;
        }
        System.out.println("The largest number is " + largestNum);
    }
}
