package src;
/**
 * Created by Nicholas on 4/16/2016.
 */
public class Sausage extends PizzaDecorator
{
    Pizza pizza;

    public Sausage(Pizza pizzaToOrder)
    {
        this.pizza = pizzaToOrder;
    }
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + "with Sausage";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + 0;
    }
}
