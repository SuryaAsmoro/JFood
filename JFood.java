
/**
 * JFood project's main class.
 *
 * @author (Surya Asmoro)
 * @version (27 Februari 2020)
 */
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
        Customer Luthfi = new Customer(0001, "Luthfi Rahman", "luthfi@ui.ac.id", "luth1234", "21-02-1999");
        Invoice invoice1 = new Invoice(0001, 0001, "27-02-1010",Luthfi , 7500);
        
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
        kentang.printData();
    }
}
