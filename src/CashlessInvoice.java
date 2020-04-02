
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.SimpleDateFormat;

public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless ;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, food, customer);
    }
    
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, food, customer);
        this.promo = promo;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo()
    {
        return promo;
    }
    
    public void setPromo(Promo promo)
    {
        this.promo = promo;
    }
    
    public void setTotalPrice()
    {
        if ((promo != null)&&(promo.getActive()==true) && (getFood().getPrice() > promo.getMinPrice()))
        {
            super.totalPrice = (getFood().getPrice())-(promo.getDiscount());
        }
        else
        {
            super.totalPrice = getFood().getPrice();
        }
    }   
    
    public String toString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        return "id = "+getId()
        +"\n"+"Nama = "+getFood().getName()
        +"\n"+"Date = "+formatter.format(getDate().getTime())
        +"\n"+"Total Price = "+getTotalPrice()
        +"\n"+"Customer = "+getCustomer().getName()
        +"\n"+"Status = "+getInvoiceStatus(); 
    }
    /*public void printData()
    {
        System.out.println("    -------------INVOICE-------------     ");
        System.out.println("ID = "+ getId());
        System.out.println("Nama ="+ getFood().getName());
        System.out.println("Date = "+ getDate());
        System.out.println("Total Price = "+ getTotalPrice());
        System.out.println("Customer = "+ getCustomer().getName());
        System.out.println("Status"+ getInvoiceStatus());
        
        if ((promo != null)&&(getPromo().getActive() == true)&&((getFood().getPrice())<(promo.getMinPrice())))
        {
            System.out.println("Kode Promo = "+ getPromo().getCode());
        }
         
    }*/
}
