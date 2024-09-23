public class Produto {
    protected String descricao;
    protected double preco;
    protected int numCamisa;
    protected String nomePerso;
    protected boolean presente;

    public Produto(){

    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        try{
            if(preco<=0){
                throw new PrecoInvalidoException();
            }
        }catch(PrecoInvalidoException e){
            System.out.println(e.getMessage());

        }
        this.preco = preco;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        try{
            if(numCamisa > 99){
                throw new NumeroCamisaException();
            }
        }catch(NumeroCamisaException e){
            System.out.println(e.getMessage());
        }
        this.numCamisa = numCamisa;
    }

    public String getNomePerso() {
        return nomePerso;
    }

    public void setNomePerso(String nomePerso) {
        this.nomePerso = nomePerso;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Produto(String descricao, double preco, int numCamisa, String nomePerso, boolean presente) {
        this.descricao = descricao;
        try{
            if(preco<=0){
                throw new PrecoInvalidoException();
            }
        }catch(PrecoInvalidoException e){
            System.out.println(e.getMessage());
        }
        this.preco = preco;
        try{
            if(numCamisa > 99){
                throw new NumeroCamisaException();
            }
        }catch(NumeroCamisaException e){
            System.out.println(e.getMessage());
        }
        this.numCamisa = numCamisa;
        this.nomePerso = nomePerso;
        this.presente = presente;
    }

    public void exibir() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Número da Camisa: " + numCamisa);
        System.out.println("Nome Personalizado: " + nomePerso);
        System.out.println("É para presente?: " + presente);
        System.out.println();
    }
}
