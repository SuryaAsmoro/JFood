
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private String date;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    private Food food;
    protected int totalPrice;
    
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.food = food;
        this.date = date;
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
    
    public String getDate()
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
    
    public void setDate(String date)
    {
        this.date = date;
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
    
    public abstract void printData();
    
}
