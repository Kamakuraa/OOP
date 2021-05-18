package udemy.exceptions;

public class ZeroDiv extends Exception{
    public ZeroDiv(Exception exception){
        super(exception);
    }
    public ZeroDiv(String message){
        super(message);
    }


}
