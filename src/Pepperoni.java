package src;
/**
 * Created by Nicholas on 4/16/2016.
 */
public class Pepperoni extends PizzaDecorator
{
    Food pizza;

    public Pepperoni(Food pizzaToOrder)
    {
        this.pizza = pizzaToOrder;
    }
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + "with Pepperoni";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + 0;
    }

    @Override
    public void order() {
        System.out.println("Added Pepperoni...");
    }
}
