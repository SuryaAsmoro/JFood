
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PaymentType
{
    Cashless("Cashless"), Cash("Cash");
    public String paymentType;
    
    private PaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }
    
    public String toString()
    {
        return paymentType;
    }
}
