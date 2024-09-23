import java.util.ArrayList;

public class CadastroProduto {
    protected ArrayList<Produto> produtos;

    public void cadastroProdutos(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }
}