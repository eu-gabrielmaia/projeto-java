public class NumeroCamisaException extends Exception{
    @Override
    public String getMessage(){
        return "A camisa não pode ter mais de dois números\n";
    }
}
