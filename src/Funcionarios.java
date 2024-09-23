public class Funcionarios extends Pessoa implements IPessoa {
    private String cargo;
    private double salario;


    public Funcionarios(){
    }

    public Funcionarios(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        try{
            if(salario <=0){
                throw new SalarioInvalidoException();
            }
        }catch(SalarioInvalidoException e){
            System.out.println(e.getMessage());
        }
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        try{
            if(salario <=0){
                throw new SalarioInvalidoException();
            }
        }catch(SalarioInvalidoException e){
            System.out.println(e.getMessage());
        }
        this.salario = salario;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
        System.out.println();
    }
}