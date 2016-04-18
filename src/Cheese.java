/**
 * Created by Nicholas on 4/16/2016.
 */
public class Cheese extends BurgerDecorator
{
    Burger burger;

    public Cheese(Burger burgerToOrder)
    {
        this.burger = burgerToOrder;
    }

    @Override
    public String getDescription()
    {

        return burger.getFoodName() + " with cheese";
        // get the description from the burger object and then add on the description from this class
        // soo for this particular class, the description you'd add is  ' with lettuce'
        // then return that(don't return null).
    }

    @Override
    public double cost()
    {

        return burger.cost() + .25;
        // get the cost from the burger object and then add on the cost for lettuce(if there is a cost) and return that value.
        // (don't return 0)
    }
}
