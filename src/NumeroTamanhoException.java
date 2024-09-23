public class NumeroTamanhoException extends Exception{
    @Override
    public String getMessage(){
        return "O tamanho da camisa deve ser apenas uma ou duas letras\n";
    }
}
