public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(){

    }
    public Pessoa(String nome, int idade) {
        try{
            if(nome.equals("")){
                throw new NomeInvalidoException();
            }
        }catch(NomeInvalidoException e){
            System.out.println(e.getMessage());
        }
        this.nome = nome;
        try{
            if(idade <= 0){
                throw new IdadeInvalidaException();
            }
        }catch(IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try{
            if(nome == ""){
                throw new NomeInvalidoException();
            }
        }catch(NomeInvalidoException e){
            System.out.println(e.getMessage());
        }
            this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        try{
            if(idade <= 0){
                throw new IdadeInvalidaException();
            }
        }catch(IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }
        this.idade = idade;
    }

    public abstract void exibir();
}