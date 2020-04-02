
/**
 * Write a description of class DatabasePromo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class DatabasePromo
{
    // instance variables - replace the example below with your own
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<>();
    private static int lastId;


    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Promo getPromoById(int id)
    {
        for (int i=0; i< PROMO_DATABASE.size(); i++)
        {
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getId() == id)
            {
                return promo;
            }
        }
        return null;
    }

    public static Promo getPromoByCode(String code)
    {
        for (int i=0; i< PROMO_DATABASE.size();i++)
        {
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getCode() == code)
            {
                return promo;
            }
        }
        return null;
    }

    public static boolean addPromo(Promo promo)
    {
        PROMO_DATABASE.add(promo);
        lastId = PROMO_DATABASE.indexOf(promo);
        return true;
    }

    public static boolean activatePromo(int id)
    {
        for (int i=0; i < PROMO_DATABASE.size();i++)
        {
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getId() == id)
            {
                promo.setActive(true);
                return true;
            }
        }
        return false;


    }

    public static boolean deactivatePromo(int id)
    {
        for (int i=0; i< PROMO_DATABASE.size();i++) {
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getId() == id) {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    public static boolean removePromo(Promo promo)
    {
        for (int i=0; i<PROMO_DATABASE.size();i++)
        {
            if (PROMO_DATABASE.get(i) == promo)
            {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        return false;
    }
}
