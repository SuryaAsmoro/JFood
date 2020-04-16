
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.time.LocalDateTime;

public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
    private int year;
    private int month;
    private int dayOfMonth;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        setEmail(email);
        setPassword(password);
        setJoinDate(joinDate);
        
        this.id = id;
        this.name = name;
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        setEmail(email);
        setPassword(password);
        setJoinDate(year, month, dayOfMonth);
        
        this.id = id;
        this.name = name;
    }
    
    public Customer(int id, String name, String email, String password)
    {
        setEmail(email);
        setPassword(password);
        setJoinDate();
        
        this.id = id;
        this.name = name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String Name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches() == true)
        {
            this.email = email;
        }
        else 
        {
            this.email = "";
        }
    }
    
    public void setPassword(String password)
    {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";//^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*{6,})*$
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        
        if (matcher.matches() == true)
        {
            this.password = password;
        }
        else 
        {
            this.password = "";
        }
    }
    
    public void setJoinDate(Calendar joinDate)
    {
        Calendar now = Calendar.getInstance();
        this.joinDate = now;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public void setJoinDate()
    {
        Calendar now = Calendar.getInstance();
        this.joinDate = now;
    }
    
    public String toString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        if (joinDate != null){
        return "id = "+id+"\n"+"Nama = "+name+"\n"+"Email = "+email+"\n"+"Password = "+password+"\n"+"joinDate = "+formatter.format(joinDate.getTime())+"\n"; 
        }
        else {
        return "id = "+id+"\n"+"Nama = "+name+"\n"+"Email = "+email+"\n"+"Password = "+password+"\n";
        }
    
    }
    /*public void printData()
    {
        System.out.println(name);
        System.out.println(email);
    }*/
    
    
}
