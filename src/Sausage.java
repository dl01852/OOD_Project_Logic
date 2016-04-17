/**
 * Created by Nicholas on 4/16/2016.
 */
public class Sausage extends BurgerDecorator
{
    public Sausage(Pizza pizzaToOrder)
    {
        super(pizzaToOrder);
    }
    @Override
    public String getDescription()
    {
        return "with Sausage";
    }

    @Override
    public double cost()
    {
        return cost;
    }
}
