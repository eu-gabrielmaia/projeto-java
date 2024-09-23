public class PrecoInvalidoException extends Exception{
    @Override
    public String getMessage(){
        return "O preço não pode ser negativo nem 0\n";
    }
}
