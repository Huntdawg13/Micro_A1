//Class used to find total area of floor
import java.util.*;

public class RoomDimension
{
   private double RoomLength;
   private double RoomWidth;
   private double RoomArea;
   
   
   public RoomDimension(double Length, double Width)
   {
      RoomLength = Length;
      RoomWidth = Width;
   }
   
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
