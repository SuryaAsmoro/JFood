
/**
 * JFood project's main class.
 *
 * @author (Surya Asmoro)
 * @version (27 Februari 2020)
 */

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
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
        //Locations ==============================
        Location lahir = new Location("Jakarta", "DKI", "Di rumah sakit");

        //Sellers ================================
        Seller Surya = new Seller(0001, "Surya Asmoro", "surya.asmoro@ui.ac.id", "0813xxxxxxxx", lahir);
        DatabaseSeller.addSeller(Surya);

        //Foods ==================================
        Food kentang = new Food(0001, "perkedel",Surya, 7500, FoodCategory.Rice);
        Food permen = new Food(0002, "Sugus",Surya, 2500, FoodCategory.Snacks);
        //Food nasi = new Food(0003, "nasi jagung",Surya, 8000, FoodCategory.Rice);
        DatabaseFood.addFood(kentang);
        DatabaseFood.addFood(permen);
        //DatabaseFood.addFood(nasi);


        //Calendars =============================
        Calendar calndr = Calendar.getInstance();

        //Customers =============================
        Customer surya = new Customer(DatabaseCustomer.getLastId()+1, "Surya Asmoro", "surya@ui.ac.id", "luth123");
        Customer surya1 = new Customer(DatabaseCustomer.getLastId()+1, "Surya Asmoro YP", "surya.asm@ui.ac.id", "Luth123");
        Customer pascal = new Customer(DatabaseCustomer.getLastId()+1, "Nala Pascal", "NalaCat@ui.ac.id", "Luthaasasf67890");
        //Customer pascal1 = new Customer(DatabaseCustomer.getLastId()+1, "Nala Pascal AA", "NalaCat@ui.ac.id", "Luth567890");
        try {
            DatabaseCustomer.addCustomer(surya);
            DatabaseCustomer.addCustomer(surya1);
            DatabaseCustomer.addCustomer(pascal);
            }
        catch (EmailAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        //PROMOS ===============================
        Promo Lebaran = new Promo(01, "LBR48", 2000, 3000, false);
        //Promo Korona = new Promo(02, "LBR48", 4000, 5000, true);
        try {
            DatabasePromo.addPromo(Lebaran);
        }
        catch (PromoCodeAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        //GENERAL ===============================
        ArrayList<Food> food1 = new ArrayList<Food>();
        ArrayList<Food> food2 = new ArrayList<Food>();
        try {
            food1.add(DatabaseFood.getFoodById(01));
            food1.add(DatabaseFood.getFoodById(02));
            food1.add(DatabaseFood.getFoodById(001));

            food2.add(DatabaseFood.getFoodById(01));
            food2.add(DatabaseFood.getFoodById(02));
        }
        catch (FoodNotFoundException e){
            System.out.println(e.getMessage());
        }

        //POSTTEST MODUL 7/////////////////////////////


        try {
            DatabaseInvoice.addInvoice(new CashInvoice(1, food1, surya1, InvoiceStatus.Ongoing, 1000));
        }
        catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new CashInvoice(2, food2, surya, InvoiceStatus.Ongoing, 1000));
        }
        catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new CashInvoice(3, food1, pascal, InvoiceStatus.Ongoing, 2000));
        }
        catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new CashInvoice(3, food1, pascal, InvoiceStatus.Ongoing, 3500));
        }
        catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try {
            DatabaseInvoice.getInvoiceById(5);
        }
        catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }

        /*int DELAY = 0;
        for (Invoice invoices : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new PriceCalculator(invoices, DELAY)).start();
        }
*/
        System.out.println("List Invoices : ");
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            invoice.setTotalPrice();
            System.out.println("\n"+invoice);
        }

        // OBSOLETES =============================

        //DatabasePromo.getPromoById(01).setActive(true);
        //DatabaseInvoice.getInvoiceByCustomer(02).setTotalPrice();
        //cashless02.setTotalPrice();
        //DatabaseInvoice.addInvoice(cashless02);


        //System.out.println(DatabaseCustomer.getCustomerDatabase());
        //System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.Rice));

        //System.out.println(DatabasePromo.getPromoDatabase());
        //System.out.println(DatabaseInvoice.getInvoiceDatabase());

        /*CashlessInvoice cashless01 = new CashlessInvoice(01, kentang, Luthfi, InvoiceStatus.Ongoing);
        CashlessInvoice cashless02 = new CashlessInvoice(01, kentang, Luthfi, InvoiceStatus.Finished);
        CashInvoice cash03 = new CashInvoice(03, permen, Luthfi, InvoiceStatus.Finished );
        CashInvoice cash04 = new CashInvoice(02, kentang, Luthfi, InvoiceStatus.Finished );
        */
        /*System.out.println(cashless01);
        System.out.println(cashless02);
        System.out.println(cash03);
        System.out.println(cash04);
        */
        /*System.out.println(surya);
        System.out.println(surya);
        System.out.println(pascal);
        */
        //Luthfi.printData();

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
