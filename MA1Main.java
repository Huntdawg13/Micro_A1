/*
Name: Hunter McClure
CptS 233: MicroAssignment #1
Date: 9/2/2020
gitRepo url:

*/

import java.util.*;

public class MA1Main
{
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
      GetMeasurements(dimension);
           
      RoomCarpet carpet = new RoomCarpet(dimension, price);
      
            
   }
   
   public static void GetMeasurements(RoomDimension dimension)
   {
      System.out.println(dimension.toString());
   }
}