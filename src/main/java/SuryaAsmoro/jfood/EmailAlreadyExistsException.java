public class EmailAlreadyExistsException extends Exception {

    private Customer customer_error;

    public EmailAlreadyExistsException (Customer customer_input){
        super("Email : ");
        this.customer_error = customer_input;
    }

    public String getMessage(){
        return super.getMessage()+customer_error.getEmail()+ " is already exist";
    }


}
