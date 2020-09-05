/*
Name: Hunter McClure
CptS 233: MicroAssignment #1
Date: 9/2/2020
gitRepo url: https://github.com/Huntdawg13/Micro_A1.git

*/

import java.util.*;

public class MA1Main
{
   //Main program that asks for info and calls on the classes
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
		System.out.print("What's the length in, feet, of the floor (enter number) ");
		double length = console.nextDouble();      
      
		System.out.print("What's the width in, feet, of the floor (enter number) ");
		double width = console.nextDouble();
		System.out.println();
      
      System.out.print("What's the price per square foot: $");
		double price = console.nextDouble();
		System.out.println();
      
      RoomDimension dimension = new RoomDimension(length, width);
      System.out.println(dimension.toString());
           
      RoomCarpet carpet = new RoomCarpet(dimension, price);
      System.out.println(carpet.toString2());          
   }
}