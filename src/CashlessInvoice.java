
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless ;
    private Promo promo;
    private int total = 0;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, foods, customer, invoiceStatus);
    }
    
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo, InvoiceStatus invoiceStatus)
    {
        super(id, foods, customer, invoiceStatus);
        this.promo = promo;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     //* @param  y  a sample parameter for a method
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
        ArrayList<Food> listFoods = new ArrayList<>();
        for (Food food: listFoods)
        {
            total += food.getPrice();
        }
        if ((promo != null)&&(promo.getActive()== true) && total > promo.getMinPrice())
        {
            super.totalPrice = (total)-(promo.getDiscount());
        }
        else
        {
            super.totalPrice = total;
        }
    }   
    
    public String toString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String foodName = "";
        for (int i = 0; i<getFoods().size(); i++)
        {
            Food foods = getFoods().get(i);
            foodName += foods.getName();
        }
        
        return "id = "+getId()
        +"\n"+"Nama = "+foodName
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
