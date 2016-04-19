/**
 * Created by Nicholas on 4/18/2016.
 */
public class MenuTester
{
    public static void main(String args[])
    {
        Burger burger = new Burger();
        //BurgerDecorator condiments = new Cheese(new Bacon());

        Cheese cheese = new Cheese(burger);
        Lettuce lettuce = new Lettuce(burger);
        Tomatoes tomatoes = new Tomatoes(burger);
        Onions onions = new Onions(burger);
        Bacon bacon = new Bacon(burger);

        //System.out.println(condiments.getDescription());

        System.out.println(burger.getFoodName());
        System.out.println(burger.cost());
        System.out.println(cheese.getDescription() + cheese.cost() + "\n" +bacon.getDescription() + bacon.cost() + "\n" + lettuce.getDescription() + lettuce.cost()+ "\n" + tomatoes.getDescription() + tomatoes.cost());
        double burgerWithEverything = burger.cost() + .75 + .25;
        System.out.println(burger.getFoodName() + "with everything = " + burgerWithEverything);
        //System.out.println(lettuce);
        //System.out.println(tomatoes);
        //System.out.println(onions);
        //System.out.println(bacon);
    }
}
