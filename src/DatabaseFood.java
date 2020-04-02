
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

    public static Food getFoodById(int id)
    {
        for (int i=0; i<FOOD_DATABASE.size();i++)
        {
            Food food = FOOD_DATABASE.get(i);
            if (food.getId() == id)
            {
                return food;
            }
        }
        return null;
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
            lastId = FOOD_DATABASE.indexOf(food);
            return true;
        }
        return false;
    }
    
    public static boolean removeFood(Food food)
    {
        for (int i=0;i<FOOD_DATABASE.size();i++)
        {
            if (FOOD_DATABASE.get(i) == food)
            {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
       return false;
    }

}
