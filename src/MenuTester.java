/**
 * Created by Nicholas on 4/18/2016.
 */
public class MenuTester
{
    public static void main(String args[])
    {
        Burger burger = new Cheese(new Lettuce(new Tomatoes(new Onions(new Bacon()))));
        System.out.println(burger.getFoodName());
        System.out.println(burger.cost());
    }
}
