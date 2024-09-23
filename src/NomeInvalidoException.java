public class NomeInvalidoException extends Exception{
    @Override
    public String getMessage(){
        return "O nome não pode ser vazio\n";
    }
}
