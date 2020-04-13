public class OngoingInvoiceAlreadyExistsException extends Exception {

    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input){
        super("Invoice : ");
        this.invoice_error = invoice_input;
    }

    public String getMessage(){
        return super.getMessage()+invoice_error.getId()+ " is already Ongoing";
    }


}
