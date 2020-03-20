
/**
 * JFood project's main class.
 *
 * @author (Surya Asmoro)
 * @version (27 Februari 2020)
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.time.LocalDateTime;

public class JFood
{
    private String test;
    /**
     * Constructor for objects of class JFood
     */
    public JFood()
    {
        
    }

    public static void main(String [] args)
    {
        Location lahir = new Location("Jakarta", "DKI", "Di rumah sakit");
        Seller Surya = new Seller(0001, "Surya Asmoro", "surya.asmoro@ui.ac.id", "0813xxxxxxxx", lahir);
        Food kentang = new Food(0001, "perkedel",Surya, 7500, FoodCategory.Rice);
        Food permen = new Food(0002, "Sugus",Surya, 2500, FoodCategory.Rice);
        Calendar calndr = Calendar.getInstance();
        
        Customer Luthfi = new Customer(0001, "Luthfi Rahman", "luthfi#ui.ac.id", "luth", calndr);
        Customer Luthfi2 = new Customer(0002, "Luthfi Rahman2", "luthfi2@ui.ac.id", "Luth123",2019,13,02);
        Customer Luthfi3 = new Customer(0003, "Luthfi Rahman3", "luthfi3@ui.ac.id", "Luth1234567890");
        
        System.out.println(Luthfi);
        System.out.println(Luthfi2);
        System.out.println(Luthfi3);
        
        //Promo Lebaran = new Promo(0007, "AKB48", 2000, 3000, true);
       
        //Luthfi.printData();
        //CashInvoice cash01 = new CashInvoice(01, kentang, "11-03-2020", Luthfi, InvoiceStatus.Finished);
        //CashInvoice cash02 = new CashInvoice(01, kentang, "11-03-2020", Luthfi, InvoiceStatus.Ongoing, 2000);
        
        /*CashlessInvoice cashless01 = new CashlessInvoice(01, kentang, "11-03-2020", Luthfi, InvoiceStatus.Ongoing);
        CashlessInvoice cashless02 = new CashlessInvoice(01, kentang, "11-03-2020", Luthfi, InvoiceStatus.Finished);
        CashlessInvoice cashless03 = new CashlessInvoice(01, permen, "11-03-2020", Luthfi, InvoiceStatus.Finished, Lebaran);
        CashlessInvoice cashless04 = new CashlessInvoice(01, kentang, "11-03-2020", Luthfi, InvoiceStatus.Finished, Lebaran);
        */
       
        //Invoice invoice1 = new Invoice(0001, 0001, "27-02-1010",Luthfi , 7500, InvoiceStatus.Finished);
        
        /*System.out.println(Surya.getName());
        Surya.setName("Bang Pascal");
        System.out.println(Surya.getName());
        kentang.printData();
        */
       
        //Surya.printData();
        /*lahir.printData();
        lahir.setProvince("Jawa Timur");
        System.out.println("===========================");
        lahir.printData();*/
        
        //System.out.println(kentang.getCategory());
        //kentang.printData();
        //invoice1.printData();
        
        /*cashless01.setTotalPrice();
        cashless02.setTotalPrice();
        cashless03.setTotalPrice();
        cashless04.setTotalPrice();*/
        
        //cash01.setTotalPrice();
        //cash02.setTotalPrice();
       
        //cash01.printData();
        //cash02.printData();
     
       
       /*cashless01.printData();
        cashless02.printData();
        cashless03.printData();
        cashless04.printData();*/
        
    }
}
