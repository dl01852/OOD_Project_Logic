/**
 * Created by Nicholas on 4/16/2016.
 */
public class Pepperoni extends BurgerDecorator
{
    public Pepperoni(Pizza pizzaToOrder)
    {
        super(pizzaToOrder);
    }
    @Override
    public String getDescription()
    {
        return "with Pepperoni";
    }

    @Override
    public double cost()
    {
        return cost;
    }
}
