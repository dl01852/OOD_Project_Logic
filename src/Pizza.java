package src;
/**
 * Created by Nicholas on 4/16/2016.
 */
public class Pizza extends Food
{
    private double cost;

    public Pizza()
    {
        FoodName = "Pizza";
    }

    @Override
    public String getDescription()
    {
        return super.getDescription();
    }

    @Override
    public double cost()
    {
        cost = 10.99;
        return cost;
    }

    @Override
    public void order() {
        //print order message
        System.out.println("Preparing pizza...");
        //... or whatever action after order submitted
    }
}
