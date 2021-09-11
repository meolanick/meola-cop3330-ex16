/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int age;

        System.out.println("What is your age?");
        age = scan.nextInt();

        if( age < 16 )
        {
            System.out.println("You are not old enough to legally drive.");
        }
        if( age >= 16 )
        {
            System.out.println("You are old enough to legally drive.");
        }

    }
}
