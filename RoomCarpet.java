//Class used to find total cost
import java.util.*;

public class RoomCarpet
{
   private RoomDimension dimension;
   private double price;
   private double totalCost;
   
   
   public RoomCarpet(RoomDimension dim, double cost)
   {
      this.dimension = dim;
      price = cost;
   }
   
   public double getTotalCost()
   {
      totalCost = price*dimension.getArea();
      
      return totalCost;
   }
   
   public String toString2()
   {
      return "The total cost to carpet your floor will be: $" + getTotalCost();
   }
}
