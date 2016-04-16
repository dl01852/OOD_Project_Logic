/**
 * Created by Nicholas on 4/16/2016.
 */
public class Tomatoes extends BurgerDecorator
{
    public Tomatoes(Burger burgerToOrder)
    {
        super(burgerToOrder);
    }

    @Override
    public String getDescription()
    {

        return "with tomato";
        // get the description from the burger object and then add on the description from this class
        // soo for this particular class, the description you'd add is  ' with lettuce'
        // then return that(don't return null).
    }

    @Override
    public double cost()
    {

        return cost;
        // get the cost from the burger object and then add on the cost for lettuce(if there is a cost) and return that value.
        // (don't return 0)
    }
}
}
