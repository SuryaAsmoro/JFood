
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Calendar date;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    private ArrayList<Food> foods;
    protected int totalPrice;
    private int year, month, dayOfMonth;
    
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, ArrayList<Food> foods, Customer customer, InvoiceStatus invoiceStatus)
    {
        setDate();
        
        this.id = id;
        this.food = food;
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.invoiceStatus = ongoing;
    }

    public int getId()
    {
        return id;
    }
    
    public ArrayList<Food> getFoods()
    {
        return food;
    }
    
    public Calendar getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setIdFood(ArrayList<Food> foods)
    {
        this.food = food;
    }
    
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    public void setDate()
    {
        Calendar now = Calendar.getInstance();
        this.date = now;
    }
    
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public abstract void setTotalPrice();
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus = status;
    }
    
    public String toString()
    {
        String foodName = "";
        for (int i = 0; i<getFoods().size(); i++)
        {
            Food foods = getFoods().get(i);
            foodName += foods.getName();
        }
        return "id = "+id+"\n"
                +"Foods = "foodName+"\n"
                +"Date = "+getDate()+"\n"
                +"Total = "+getTotalPrice()+"\n"
                +"Customer = "+getCustomer().getName()+"\n"
                +"Payment Type = "+getPaymentType()+"\n";
                +"Status = "+getInvoiceStatus()+"\n";

    }
    //public abstract void printData();
    
}
