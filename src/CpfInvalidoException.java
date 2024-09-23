public class CpfInvalidoException extends Exception{
    @Override
    public String getMessage(){
        return "O CPF deve conter 11 digitos\n";
    }
}