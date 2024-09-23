public class SalarioInvalidoException extends Exception{
    @Override
    public String getMessage(){
        return "O salario pode ser negativo\n";
    }
}
