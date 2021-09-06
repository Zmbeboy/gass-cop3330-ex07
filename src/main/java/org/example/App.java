/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String length = scan.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width = scan.nextLine();

        int len = Integer.parseInt(length);
        int wid = Integer.parseInt(width);

        int ftarea = len*wid;
        double marea = (double)ftarea * 0.09290304;

        System.out.println(String.format("You entered dimensions of %d feet by %d feet.\nThe area is\n%d square feet\n%.3f square meters",len,wid,ftarea,marea));
    }
}