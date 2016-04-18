/**
 * Created by Nicholas on 4/16/2016.
 */
public class Pepperoni extends PizzaDecorator
{
    Pizza pizza;

    public Pepperoni(Pizza pizzaToOrder)
    {
        this.pizza = pizzaToOrder;
    }
    @Override
    public String getDescription()
    {
        return pizza.getFoodName() + "with Pepperoni";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + 0;
    }
}
