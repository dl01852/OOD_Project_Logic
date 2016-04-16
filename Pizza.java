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
    public String getFoodName()
    {
        return super.getFoodName();
    }
    @Override
    public double cost()
    {
        return 10.99;
    }
}
