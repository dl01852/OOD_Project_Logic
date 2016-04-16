/**
 * Created by Nicholas on 4/16/2016.
 */
public class BaconBits extends BurgerDecorator
{
    public BaconBits(Pizza pizzaToOrder)
    {
        super(pizzaToOrder);
    }
    @Override
    public String getDescription()
    {
        return "with bacon bits";
    }

    @Override
    public double cost()
    {
        return cost;
    }
}
