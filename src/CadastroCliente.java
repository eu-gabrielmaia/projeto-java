import java.util.ArrayList;

public class CadastroCliente {
    protected ArrayList<Cliente> clientes;

    public void cadastroClientes(){
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        clientes.remove(cliente);
    }
}