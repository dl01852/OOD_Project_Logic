/**
 * Created by Nicholas on 4/16/2016.
 */
public class Mushrooms extends BurgerDecorator
{
    public Mushrooms(Pizza pizzaToOrder)
    {
        super(pizzaToOrder);
    }
    @Override
    public String getDescription()
    {
        return "with mushrooms";
    }

    @Override
    public double cost()
    {
        return cost;
    }
}
