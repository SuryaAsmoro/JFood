
/**
 * Write a description of class DatabaseSeller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class DatabaseSeller
{
    // instance variables - replace the example below with your own
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<>();
    //ArrayList SELLER_DATABASE = new ArrayList();
    private static int lastId;

    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Seller getSellerById(int id)
    {
        for (int i=0;i<SELLER_DATABASE.size();i++)
        {
            Seller seller = SELLER_DATABASE.get(i);
            if (seller.getId() == id) {
                return seller;
            }
        }
        return null;
    }

    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
        return true;
    }
    
    public static boolean removeSeller(int id)
    {
        for (int i=0; i<SELLER_DATABASE.size();i++)
        {
            Seller seller = SELLER_DATABASE.get(i);
            if (seller.getId() == id) {
                SELLER_DATABASE.remove(seller);
                return true;
            }
        }

        return false;
    }

}
