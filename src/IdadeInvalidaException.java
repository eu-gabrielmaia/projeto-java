public class IdadeInvalidaException extends Exception{
    @Override
    public String getMessage(){
        return "A idade não pode ser negativa nem vazia\n";
    }
}
