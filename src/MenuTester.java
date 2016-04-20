package src;

/**
 * Created by david-lewis on 4/19/2016.
 */
public class MenuTester {

   public static void main(String[] args)
   {

       Food burger = new Burger();
       //burger = new Cheese(new Bacon(burger));
       burger = new Cheese(new Bacon(new Lettuce(new Tomatoes(new Onions(burger)))));
       System.out.println(String.format("%s: %.2f",burger.getDescription(),burger.cost()));

       Food pizza = new Pizza();
       //pizza = new Pepperoni(new Sausage(pizza));
       pizza = new Pepperoni((new Mushrooms(new Olives(new Sausage(pizza)))));
       System.out.println(String.format("%s: %.2f",pizza.getDescription(),pizza.cost()));

   }
}
