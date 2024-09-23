import java.util.ArrayList;

public class Cliente extends Pessoa implements IPessoa{
    protected int codCliente;
    protected String numTamanho;
    protected String cpf;

    public Cliente(){

    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNumTamanho() {
        return numTamanho;
    }

    public void setNumTamanho(String numTamanho) {
        try{
            if(numTamanho.length() == 1){
                throw new NumeroTamanhoException();
            }
        }catch(NumeroTamanhoException e){
            System.out.println(e.getMessage());
        }
        this.numTamanho = numTamanho;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        try {
            if (cpf.length() != 12) {
                throw new CpfInvalidoException();
            }
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }
        this.cpf = cpf;
    }

    public Cliente(String nome, int idade, int codCliente, String numTamanho, String cpf) {
        super(nome, idade);
        this.codCliente = codCliente;
        try{
            if(numTamanho.length() < 1 || numTamanho.length() > 2){
                throw new NumeroTamanhoException();
            }
        }catch(NumeroTamanhoException e){
            System.out.println(e.getMessage());
        }
        this.numTamanho = numTamanho;

        try {
            if (cpf.length() != 12) {
                throw new CpfInvalidoException();
            }
        }catch(CpfInvalidoException e){
            System.out.println(e.getMessage());
        }
        this.cpf = cpf;
    }

    @Override
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Código do cliente: " + codCliente);
        System.out.println("Tamanho: " + numTamanho);
        System.out.println("CPF: " + cpf);
        System.out.println();
    }
}
