package src;

/**
 * Created by david-lewis on 4/19/2016.
 */
public class MenuTester {

   public static void main(String[] args)
   {

       Food burger = new Burger();
       burger = new Cheese(new Bacon(burger));
       System.out.println(String.format("%s: %.2f",burger.getDescription(),burger.cost()));

   }
}
