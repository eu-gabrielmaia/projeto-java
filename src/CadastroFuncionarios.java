import java.util.ArrayList;

public class CadastroFuncionarios {
    protected ArrayList<Funcionarios> funcionarios;

    public void cadastroFuncionarios(){
       funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionarios funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionarios(Funcionarios funcionario){
        funcionarios.remove(funcionario);
    }
}