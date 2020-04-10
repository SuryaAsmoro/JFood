
/**
 * Write a description of class DatabaseFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class DatabaseFood
{
    // instance variables - replace the example below with your own
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int lastId;

    public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }

    public  static int getLastId()
    {
        return lastId;
    }

    public static Food getFoodById(int id)throws FoodNotFoundException
    {
        for (int i=0; i<FOOD_DATABASE.size();i++)
        {
            Food food = FOOD_DATABASE.get(i);
            if (food.getId() == id)
            {
                return food;
            }
        }
        throw new FoodNotFoundException(id);
    }

    public static ArrayList<Food> getFoodBySeller(int sellerid)
    {
        ArrayList<Food> temp = new ArrayList<>();
        for (int i=0; i<FOOD_DATABASE.size();i++)
        {
            Food food = FOOD_DATABASE.get(i);
            if (food.getSeller().getId() == sellerid)
            {
                temp.add(food);
            }
        }
        return temp;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> temp = new ArrayList<>();
        for (int i=0;i<FOOD_DATABASE.size();i++)
        {
            Food food = FOOD_DATABASE.get(i);
            if (food.getCategory() == category)
            {
                temp.add(food);
            }
        }
        return temp;
    }

    public static boolean addFood(Food food)
    {
        if (FOOD_DATABASE.add(food))
        {
            lastId = food.getId();
            return true;
        }
        return false;
    }
    
    public static boolean removeFood(int id)throws FoodNotFoundException
    {

        for (int i = 0; i < FOOD_DATABASE.size(); i++) {
            if (FOOD_DATABASE.get(i).getId() == id) {
                    FOOD_DATABASE.remove(i);
                    return true;
            }
        }
        throw new FoodNotFoundException(id);
    }

}
