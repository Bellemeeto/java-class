/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.belle.helloworld;

import java.util.Scanner;
/**
 *
 * @author belle
 */
public class WindowMaster {
  public static void main(String [] args) {
    // declare variables for height and width
    float height;
    float width;

    // declare String variables to hold the user's height and
    // width input
    String stringHeight;
    String stringWidth;

    // declare other variables
    float areaOfWindow;
    float cost = 0;
    float perimeterOfWindow;

    // declare and initialize the Scanner
    Scanner myScanner = new Scanner(System.in);

    // get input from the user
    System.out.println("Please enter window height:");
    stringHeight = myScanner.nextLine();
    System.out.println("Please enter window width:");
    stringWidth = myScanner.nextLine();
       
    // convert String values of height and width to float values
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);
   
    // calculate the area of the window
    areaOfWindow = height * width;

    // calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);
   
    // display the results to the user
    System.out.println("Window height = " + stringHeight);
    System.out.println("Window width = " + stringWidth);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost);
}

}

