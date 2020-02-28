
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private Seller seller; //27 Feb edit (27feb)
    private int price;
    private String category;
   

    /**
     * Constructor for objects of class Food
     */
    public Food(int id, String name, Seller seller, int price, String category) //27f
    {
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;

    }

    public int getId()
    {
       return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Seller getSeller() //27feb
    {
        return seller;
    }
    
    public int getPrice()
    {
       return price;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSeller(Seller seller)//27feb
    {
        this.seller = seller;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    public void printData()//27feb
    {
        System.out.println(name);
    }
}
