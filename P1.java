///package com.company;
import java.util.Scanner;

public class P1
{
    public static void main (String[] args)
    {
        System.out.println("Taking Input from the user");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter The first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();
        double sum = a+b;
        System.out.println("The sum of thess numbers is:");
        System.out.println(sum);
    
    }
}