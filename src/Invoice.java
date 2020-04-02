
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
    private Food food;
    protected int totalPrice;
    private int year, month, dayOfMonth;
    
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        setDate();
        
        this.id = id;
        this.food = food;
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.invoiceStatus = invoiceStatus;
    }

    public int getId()
    {
        return id;
    }
    
    public Food getFood()
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
    
    public void setIdFood(Food food)
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
        return "a";
    }
    //public abstract void printData();
    
}
