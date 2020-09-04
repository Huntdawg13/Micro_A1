//Class used to find total cost
import java.util.*;

public class RoomCarpet
{
   private RoomDimension dimension;
   private double price;
   
   
   public RoomCarpet(RoomDimension dim, double cost)
   {
      this.dimension = dim;
      price = cost;
   }
   
   public double getTotalCost()
   {
      return price*dimension.getArea();
   }
}
