public class PriceCalculator implements Runnable {

    private Invoice invoice;
    private String threadName;
    private int delay;
    private Thread t;

    public PriceCalculator (Invoice invoice, int delay){
        this.invoice = invoice;
        this.delay = delay;
        this.threadName = "Calculating Invoice with ID : "+invoice.getId();
    }

    @Override
    public void run(){
        System.out.println(threadName);
        int threads = 10;

        while (threads > 10){
            try {
                Thread.sleep(delay);
                invoice.setTotalPrice();
            }
            catch (InterruptedException e){
                System.out.println("Calculation Interupted"+e.getMessage());
            }
            threads--;
        }
        System.out.println("Invoice with ID : "+invoice.getId()+" has calculated successfully");
    }

    public void start(){
        if (t == null){
            t = new Thread(this);
            t.start();
        }
    }
}


