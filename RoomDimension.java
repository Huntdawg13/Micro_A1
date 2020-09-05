//Class used to find total area of floor
import java.util.*;

public class RoomDimension
{
   private double RoomLength;
   private double RoomWidth;
   private double RoomArea;
   
   //Constructor that stores the dimensions of the floor
   public RoomDimension(double Length, double Width)
   {
      RoomLength = Length;
      RoomWidth = Width;
   }
   
   //Gets the area of the floor
   public double getArea()
   {
      RoomArea = RoomLength*RoomWidth;
      
      return RoomArea;
   }
   
   public String toString()
   {
      return "Length: " + RoomLength + " feet \n" + "Width: " + RoomWidth +
               " feet \n" + "Area: " + getArea() + " square feet";
   }
}
