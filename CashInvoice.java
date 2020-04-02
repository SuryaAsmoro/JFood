
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.SimpleDateFormat;

public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash ;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
    }
    
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, customer, invoiceStatus);
        this.deliveryFee = deliveryFee;
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
    
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }
    
    public void setTotalPrice()
    {
        if (deliveryFee >= 0)
        {
            super.totalPrice = (getFood().getPrice()+deliveryFee);
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
        +"\n"+"Food = "+getFood().getName()
        +"\n"+"Date = "+formatter.format(getDate().getTime())
        +"\n"+"Total Price = "+getTotalPrice()
        +"\n"+"Customer = "+getCustomer().getName()
        +"\n"+"Status = "+getInvoiceStatus()
        +"\n"+"Payment Type = "+getPaymentType();
    }
    /*public void printData()
    {
        System.out.println("    -------------INVOICE-------------     ");
        System.out.println("ID = "+ getId());
        System.out.println("Food ="+ getFood().getName());
        System.out.println("Date = "+ getDate());
        System.out.println("Delivery Fee = "+ deliveryFee);
        System.out.println("Total Price = "+ getTotalPrice());
        System.out.println("Customer = "+ getCustomer().getName());
        System.out.println("Status = "+ getInvoiceStatus());
        System.out.println("Payment Type = "+ getPaymentType());
       
    }*/
}
