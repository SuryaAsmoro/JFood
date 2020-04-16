import java.util.ArrayList;

public class DatabaseInvoice {

    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId;

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
    {
        for (int i=0;i<INVOICE_DATABASE.size();i++)
        {
            Invoice invoice = INVOICE_DATABASE.get(i);
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static Invoice getInvoiceByCustomer(int customerId)
    {
        for (int i=0; i< INVOICE_DATABASE.size();i++)
        {
            Invoice invoice = INVOICE_DATABASE.get(i);
            if (invoice.getCustomer().getId() == customerId)
            {
                return invoice;
            }
        }
        return null;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        //INVOICE_DATABASE.add(invoice);
        //lastId = invoice.getId();
        //return true;
        for (int i=0; i<INVOICE_DATABASE.size();i++) {
            if (INVOICE_DATABASE.get(i).getId() == invoice.getId() && invoice.getInvoiceStatus().equals(InvoiceStatus.Ongoing)) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        //invoice.setId(1+ lastId++);
        INVOICE_DATABASE.add(invoice);
        return true;
    }

    public static boolean changeInvoice(int id, InvoiceStatus invoiceStatus)
    {
        for (int i=0; i<INVOICE_DATABASE.size();i++)
        {
            Invoice invoice = INVOICE_DATABASE.get(i);
            if (invoice.getId() == id && invoice.getInvoiceStatus().equals("Ongoing")) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for (int i=0; i<INVOICE_DATABASE.size();i++)
        {
            Invoice invoice = INVOICE_DATABASE.get(i);
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}
