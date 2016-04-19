/**
 * Created by Nicholas on 4/18/2016.
 */
public class MenuTester
{
    public static void main(String args[])
    {
        Burger burger = new Burger();
        BurgerDecorator condiments = new Cheese(new Bacon(burger));

        //Cheese cheese = new Cheese(burger);
        //Lettuce lettuce = new Lettuce(burger);
        //Tomatoes tomatoes = new Tomatoes(burger);
        //Onions onions = new Onions();
        //Bacon bacon = new Bacon(burger);

        System.out.println(condiments.getDescription());
        System.out.println(burger.getFoodName());
        System.out.println(burger.cost());
        //System.out.println(cheese);
        //System.out.println(lettuce);
        //System.out.println(tomatoes);
        //System.out.println(onions);
        //System.out.println(bacon);
    }
}
