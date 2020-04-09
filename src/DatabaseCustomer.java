
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId;

    /**
     * An example of a method - replace this comment with your own
     *
     //* @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Customer getCustomerById(int id) throws CustomerNotFoundException {
        for (int i=0;i<CUSTOMER_DATABASE.size();i++)
        {
            Customer customer = CUSTOMER_DATABASE.get(i);
            if (customer.getId() == id)
            {
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistsException {
        for (int i=0; i<CUSTOMER_DATABASE.size();i++) {
            if (CUSTOMER_DATABASE.get(i).getEmail().equals(customer.getEmail())) {
                throw new EmailAlreadyExistsException(customer);
            }
        }

        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    
    public static boolean removeCustomer(int id)throws CustomerNotFoundException
    {
        for (int i=0;i<CUSTOMER_DATABASE.size();i++)
        {
            if(CUSTOMER_DATABASE.get(i).getId() == id)
            {
                CUSTOMER_DATABASE.remove(i);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

}
