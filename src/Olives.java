/**
 * Created by Nicholas on 4/16/2016.
 */
public class Olives extends BurgerDecorator
{
    public Olives(Pizza pizzaToOrder)
    {
        super(pizzaToOrder);
    }
    @Override
    public String getDescription()
    {
        return "with Olives";
    }

    @Override
    public double cost()
    {
        return cost;
    }
}
