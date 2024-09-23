import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Leonardo", 18, 1, "M", "191983710-88");
        Cliente c2 = new Cliente("Pedro", 15, 2, "P", "039816640-43");
        Cliente c3 = new Cliente("Alexandre", 24, 3, "GG", "341941040-99");
        Cliente c4 = new Cliente("Amanda", 61, 4, "P", "683655630-02");
        Cliente c5 = new Cliente("Maria", 15, 5, "G", "333333333-33");
        Cliente c6 = new Cliente("Carlos", 48, 6, "GG", "444444444-44");
        Cliente c7 = new Cliente("Beatriz", 30, 7, "XL", "555555555-55");
        Cliente c8 = new Cliente("Lucas", 65, 8, "M", "666666666-66");
        Cliente c9 = new Cliente("",40,123,"M","123456789-01");

        Funcionarios f1 = new Funcionarios("Roberto", 60, "Diretor", 1000);
        Funcionarios f2 = new Funcionarios("Daniela", 45, "Professor", 1250);
        Funcionarios f3 = new Funcionarios("João", 56, "Chefe", 25000);
        Funcionarios f4 = new Funcionarios("Fernanda",30,"Estágiario", 800);

        Produto p1 = new Produto("Uniforme 2 - São Paulo", 300, 10, "Flakes", false);
        Produto p2 = new Produto("Uniforme 1 - Flamengo", 50, 14, "Arrascaeta", true);
        Produto p3 = new Produto("Uniforme 3 - Man. City", 70, 17, "De Bruyne", false);
        Produto p4 = new Produto("Uniforme 1 - São Paulo", 250, 99, "Gabigol", false);
        Produto p5 = new Produto("Jaqueta 1 - Real Madrid", 130, 11, "Ramirez", true);

        boolean encontrado = false;

        //instancia
        CadastroCliente listaClientes = new CadastroCliente();

        //cria a lista e adiciona os clientes
        listaClientes.cadastroClientes();
        listaClientes.adicionarCliente(c1);
        listaClientes.adicionarCliente(c2);
        listaClientes.adicionarCliente(c3);
        listaClientes.adicionarCliente(c4);
        listaClientes.adicionarCliente(c5);
        listaClientes.adicionarCliente(c6);
        listaClientes.adicionarCliente(c7);
        listaClientes.adicionarCliente(c8);
        //se precisar remover
        listaClientes.removerCliente(c3);

        CadastroFuncionarios listaFuncionarios = new CadastroFuncionarios();
        listaFuncionarios.cadastroFuncionarios();
        listaFuncionarios.adicionarFuncionario(f1);
        listaFuncionarios.adicionarFuncionario(f2);
        listaFuncionarios.adicionarFuncionario(f3);
        listaFuncionarios.adicionarFuncionario(f4);

        CadastroProduto listaProdutos = new CadastroProduto();
        listaProdutos.cadastroProdutos();
        listaProdutos.adicionarProduto(p1);
        listaProdutos.adicionarProduto(p2);
        listaProdutos.adicionarProduto(p3);
        listaProdutos.adicionarProduto(p4);
        listaProdutos.adicionarProduto(p5);

        while (true) {
            System.out.println();
            System.out.println("-----------------MENU---------------------");
            System.out.println("Digite qual sistema você quer utilizar!\n");

            System.out.println("Clientes: ");
            System.out.println("1 - Buscar clientes");
            System.out.println("2 - Adicionar cliente");
            System.out.println("3 - Remover cliente");
            System.out.println();

            System.out.println("Funcionarios:");
            System.out.println("4 - Buscar funcionarios");
            System.out.println("5 - Adicionar funcionario");
            System.out.println("6 - Remover funcionario");
            System.out.println();

            System.out.println("Produtos:");
            System.out.println("7 - Buscar produtos por descrição");
            System.out.println("8 - Buscar produtos por preço");
            System.out.println("9 - Adicionar produto");
            System.out.println("10 - Remover produto");
            System.out.println();
            System.out.println("Outros comandos:");
            System.out.println("0 - Informações");


            //Busca o tipo de pesquisa
            Scanner scannerSistema = new Scanner(System.in);
            int tipoSistema = scannerSistema.nextInt();

            switch (tipoSistema) {
                //busca cliente por nome
                case 1:
                    System.out.println();
                    System.out.println("Você escolheu Buscar clientes!");
                    System.out.println("Digite o nome ou parte do nome a ser pesquisado:");

                    Scanner scannerCliente = new Scanner(System.in);
                    String pesquisaCliente = scannerCliente.nextLine();

                    //Exibe apenas os itens de acordo com o texto
                    System.out.println();
                    for (Cliente c : listaClientes.clientes) {
                        if (c.nome.toLowerCase().contains(pesquisaCliente.toLowerCase())) {
                            encontrado = true;
                            c.exibir();
                        }
                    }
                    if (encontrado){
                        System.out.println("Cliente(s) encontrado(s) com sucesso!");
                    }
                    else {
                        System.out.println("Nenhum cliente com '"+pesquisaCliente+"' foi encontrado\n");
                    }
                    break;

                //adiciona clientes
                case 2:
                    System.out.println();
                    System.out.println("Você escolheu Adicionar cliente!");
                    //nome
                    String adicionaNomeCliente;
                    do {
                        System.out.println("Digite o nome do cliente: ");
                        Scanner scannerNomeCliente = new Scanner(System.in);
                        adicionaNomeCliente = scannerNomeCliente.nextLine();
                        if (adicionaNomeCliente == "") {
                            System.out.println("O nome não pode ser vazio. Tente novamente!");
                        }
                    } while (adicionaNomeCliente == "");


                    //idade
                    int adicionaIdadeCliente;
                    do {
                        System.out.println();
                        System.out.println("Digite a idade do cliente: ");
                        Scanner scannerIdadeCliente = new Scanner(System.in);
                        adicionaIdadeCliente = scannerIdadeCliente.nextInt();
                        if (adicionaIdadeCliente <= 0) {
                            System.out.println("A idade não pode ser negativa nem vazia. Tente novamente!");
                        }
                    } while (adicionaIdadeCliente <= 0);

                    //codigo
                    System.out.println();
                    System.out.println("Digite o código do cliente: ");
                    Scanner scannerCodigoCliente = new Scanner(System.in);
                    int adicionaCodigoCliente = scannerCodigoCliente.nextInt();

                    //tamanho
                    String adicionaNumTamanhoCliente;
                    do {
                        System.out.println();
                        System.out.println("Digite o seu tamanho de camisa que o cliente utiliza: ");
                        Scanner scannerNumTamanhoCliente = new Scanner(System.in);
                        adicionaNumTamanhoCliente = scannerNumTamanhoCliente.nextLine();
                        if (adicionaNumTamanhoCliente == "" || adicionaNumTamanhoCliente.length()>2) {
                            System.out.println("O tamanho da camisa deve ser apenas uma ou duas letras. Tente novamente!");
                        }
                    } while (adicionaNumTamanhoCliente == "" || adicionaNumTamanhoCliente.length()>2);

                    //cpf
                    String adicionaCPFCliente;
                    do {
                        System.out.println();
                        System.out.println("Digite o cpf (xxxxxxxxx-xx): ");
                        Scanner scannerCPFCliente = new Scanner(System.in);
                        adicionaCPFCliente = scannerCPFCliente.nextLine();
                        if (adicionaCPFCliente.length() != 12) {
                            System.out.println("O CPF deve conter 11 digitos. Tente novamente!");
                        }
                    } while (adicionaCPFCliente.length() != 12);


                    //cria o cliente com as informacoes
                    System.out.println();
                    Cliente cc = new Cliente(adicionaNomeCliente, adicionaIdadeCliente, adicionaCodigoCliente, adicionaNumTamanhoCliente, adicionaCPFCliente);
                    listaClientes.adicionarCliente(cc);

                    System.out.println("Cliente adicionado com sucesso!\n");
                    break;

                //remover clientes
                case 3:
                    System.out.println();
                    System.out.println("Você escolheu Remover cliente!");
                    System.out.println("Digite o nome ou parte do nome do cliente: ");

                    Scanner scannerNomeCliente = new Scanner(System.in);
                    String removeNomeCliente = scannerNomeCliente.nextLine();

                    Cliente auxCliente = new Cliente();
                    for (Cliente c: listaClientes.clientes) {
                        if (c.nome.toLowerCase().contains(removeNomeCliente.toLowerCase())) {
                            encontrado = true;
                            auxCliente = c;
                        }
                    }
                    listaClientes.removerCliente(auxCliente);
                    if (encontrado){
                        System.out.println("Cliente removido com sucesso!");
                    }
                    else {
                        System.out.println("Nenhum cliente com '"+auxCliente+"' foi encontrado\n");
                    }
                    break;

                //FUNCIONARIOS
                //BUSCA FUNCIONARIO
                case 4:
                    System.out.println();
                    System.out.println("Você escolheu Buscar funcionários!");
                    System.out.println("Digite o nome ou parte do nome a ser pesquisado:");
                    Scanner scannerFuncionario = new Scanner(System.in);
                    String pesquisaFuncionario = scannerFuncionario.nextLine();

                    for (Funcionarios f : listaFuncionarios.funcionarios) {
                        if (f.nome.toLowerCase().contains(pesquisaFuncionario.toLowerCase())) {
                            encontrado = true;
                            f.exibir();
                        }
                    }
                    if (encontrado){
                        System.out.println("Funcionário(s) encontrado(s) com sucesso!");
                    }
                    else {
                        System.out.println("Nenhum funcionário com '"+pesquisaFuncionario+"' foi encontrado\n");
                    }
                    break;

                case 5: //ADICIONA FUNCIONARIO
                    System.out.println();
                    System.out.println("Você escolheu Adicionar funcionario!");

                    //nome
                    String adicionaNomeFuncionario;
                    do {
                        System.out.println("Digite o nome do funcionario: ");
                        Scanner scannerNomeFuncionario = new Scanner(System.in);
                        adicionaNomeFuncionario = scannerNomeFuncionario.nextLine();
                        if (adicionaNomeFuncionario.length() == 0) {
                            System.out.println("O nome não pode ser vazio. Tente novamente!");
                        }
                    } while (adicionaNomeFuncionario.length() == 0);


                    //idade
                    int adicionaIdadeFuncionario;
                    do {
                        System.out.println();
                        System.out.println("Digite a idade do funcionário: ");
                        Scanner scannerIdadeFuncionario = new Scanner(System.in);
                        adicionaIdadeFuncionario = scannerIdadeFuncionario.nextInt();
                        if (adicionaIdadeFuncionario <= 0) {
                            System.out.println("A idade não pode ser negativa nem vazia. Tente novamente!");
                        }
                    } while (adicionaIdadeFuncionario <= 0);

                    //cargo
                    System.out.println();
                    System.out.println("Digite o cargo do funcionario: ");
                    Scanner scannerCargoFuncionario = new Scanner(System.in);
                    String adicionaCargoFuncionario = scannerCargoFuncionario.nextLine();


                    //salario
                    int adicionaSalarioFuncionario;
                    do {
                        System.out.println();
                        System.out.println("Digite o salário do funcionário: ");
                        Scanner scannerSalarioFuncionario = new Scanner(System.in);
                        adicionaSalarioFuncionario = scannerSalarioFuncionario.nextInt();
                        if (adicionaSalarioFuncionario <= 0) {
                            System.out.println("O salario pode ser negativo. Tente novamente!");
                        }
                    } while (adicionaSalarioFuncionario <= 0);

                    //cria o funcionario com as informacoes
                    System.out.println();
                    Funcionarios ff = new Funcionarios(adicionaNomeFuncionario, adicionaIdadeFuncionario, adicionaCargoFuncionario, adicionaSalarioFuncionario);
                    listaFuncionarios.adicionarFuncionario(ff);

                    System.out.println("Funcionario adicionado com sucesso!\n");
                    break;

                //REMOVE FUNCIONARIO
                case 6:
                    System.out.println();
                    System.out.println("Você escolheu Remover funcionario!");
                    System.out.println("Digite o nome ou parte do nome a ser pesquisado:");

                    Scanner scannerRemoveFuncionario = new Scanner(System.in);
                    String removeFuncionario = scannerRemoveFuncionario.nextLine();

                    Funcionarios auxFuncionario = new Funcionarios();
                    for (Funcionarios f: listaFuncionarios.funcionarios) {
                        if (f.nome.toLowerCase().contains(removeFuncionario.toLowerCase())) {
                            encontrado = true;
                            auxFuncionario = f;
                        }
                    }
                    listaFuncionarios.removerFuncionarios(auxFuncionario);
                    if (encontrado){
                        System.out.println("Funcionário removido com sucesso!");
                    }
                    else {
                        System.out.println("Nenhum funcionário com '"+removeFuncionario+"' foi encontrado\n");
                    }
                    break;


                //PRODUTOS
                //BUSCAR DESCRICAO PRODUTO
                case 7:
                    System.out.println("Você escolheu Buscar produtos por descrição!");
                    System.out.println("Digite a descrição ou parte da descrição a ser pesquisada:");

                    Scanner scannerProdutoDescricao = new Scanner(System.in);
                    String pesquisaDescricaoProduto = scannerProdutoDescricao.nextLine();


                    for (Produto p : listaProdutos.produtos) {
                        if (p.descricao.toLowerCase().contains(pesquisaDescricaoProduto.toLowerCase())) {
                            encontrado = true;
                            p.exibir();
                        }
                    }
                    if (encontrado){
                        System.out.println("Produto(s) encontrado(s) com sucesso!");
                    }
                    else {
                        System.out.println("Nenhum produto com '"+pesquisaDescricaoProduto+"' foi encontrado\n");
                    }
                    break;

                //BUSCAR PRECO PRODUTO
                case 8:
                    System.out.println("Você escolheu Buscar produtos por preço!");
                    System.out.println("Digite o preco a ser pesquisada:");

                    Scanner scannerProduto = new Scanner(System.in);
                    double pesquisaPrecoProduto = scannerProduto.nextDouble();

                    for (Produto p : listaProdutos.produtos) {
                        if (p.preco == pesquisaPrecoProduto) {
                            encontrado = true;
                            p.exibir();
                        }
                    }
                    if (encontrado){
                        System.out.println("Produto(s) encontrado(s) com sucesso!");
                    } else {
                        System.out.println("Nenhum produto por R$'" + pesquisaPrecoProduto + "' foi encontrado");
                    }
                    break;

                case 9:
                    System.out.println("Você escolheu Adicionar produtos!");

                    //descricao
                    String adicionaDescricaoProduto;
                    do {
                        System.out.println();
                        System.out.println("Digite a descricao do produto: ");
                        Scanner scannerDescricaoProduto = new Scanner(System.in);
                        adicionaDescricaoProduto = scannerDescricaoProduto.nextLine();
                        if (adicionaDescricaoProduto == ""){
                            System.out.println("A descrição não pode ser vazia");
                        }
                    }while(adicionaDescricaoProduto == "");

                    //preco
                    double adicionaPrecoProduto;
                    do {
                        System.out.println();
                        System.out.println("Digite o preco do produto: ");
                        Scanner scannerPrecoProduto = new Scanner(System.in);
                        adicionaPrecoProduto = scannerPrecoProduto.nextDouble();
                        if (adicionaPrecoProduto <= 0) {
                            System.out.println("O preço não pode ser negativo nem 0. Tente novamente!");
                        }
                    } while (adicionaPrecoProduto <= 0);

                    //numero na camisa
                    int adicionaNumeroCamisaProduto;
                    do {
                        System.out.println();
                        System.out.println("Digite o número que estará na camisa: ");
                        Scanner scannerNumeroCamisaProduto = new Scanner(System.in);
                        adicionaNumeroCamisaProduto = scannerNumeroCamisaProduto.nextInt();
                        if (adicionaNumeroCamisaProduto > 99) {
                            System.out.println("A camisa não pode ter mais de dois números. Tente novamente!");
                        }
                    } while (adicionaNumeroCamisaProduto > 99);

                    //nome personalizado
                    System.out.println();
                    System.out.println("Digite o nome personalizado que estará na camisa: ");
                    Scanner scannerNomePersonalizadoProduto = new Scanner(System.in);
                    String adicionaNomePersonalizadoProduto = scannerNomePersonalizadoProduto.nextLine();

                    //é pra presente?
                    System.out.println();
                    System.out.println("O produto será para presente: (informe false ou true)");
                    Scanner scannerProdutoParaPresente = new Scanner(System.in);
                    boolean adicionaProdutoParaPresente = scannerProdutoParaPresente.nextBoolean();

                    //cria o produto com as informacoes
                    System.out.println();
                    Produto pp = new Produto(adicionaDescricaoProduto, adicionaPrecoProduto, adicionaNumeroCamisaProduto, adicionaNomePersonalizadoProduto, adicionaProdutoParaPresente);
                    listaProdutos.adicionarProduto(pp);

                    System.out.println("Produto adicionado com sucesso!\n");
                    break;

                case 10:// REMOVE PRODUTO
                    System.out.println();
                    System.out.println("Você escolheu Remover produto!");
                    System.out.println("Digite a descricao ou parte da descricao a ser pesquisada:");

                    Scanner scannerRemoveProduto = new Scanner(System.in);
                    String removeProduto = scannerRemoveProduto.nextLine();

                    Produto auxProduto = new Produto();
                    for (Produto p: listaProdutos.produtos) {
                        if (p.descricao.toLowerCase().contains(removeProduto.toLowerCase())) {
                            encontrado = true;
                            auxProduto = p;
                        }
                    }
                    listaProdutos.removerProduto(auxProduto);
                    if (encontrado){
                        System.out.println("Produto removido com sucesso!");
                    }
                    else {
                        System.out.println("Nenhum produto com '"+removeProduto+"' foi encontrado\n");
                    }
                    break;

                case 0: //INFORMAÇOES
                    System.out.println();
                    System.out.println("Você escolheu Informações! Agora defina:");
                    System.out.println("1 - Clientes");
                    System.out.println("2 - Produtos");

                    Scanner scannerInformacao = new Scanner(System.in);
                    int tipoInformacao = scannerInformacao.nextInt();

                    switch (tipoInformacao) {
                        //INFORMAÇOES DOS CLIENTES
                        case 1:
                            System.out.println();
                            System.out.println("Você escolheu Clientes! Agora defina:");
                            System.out.println("i - Clientes maiores de 18 anos");
                            System.out.println("ii - O cliente mais jovem");
                            System.out.println("iii - Quantidade de clientes maiores de 60 anos");
                            System.out.println("iv - Quantidade de clientes menores de 18 anos");
                            System.out.println("v - Média de idades dos clientes");

                            Scanner scannerBuscaCliente = new Scanner(System.in);
                            String tipoBuscaCliente = scannerBuscaCliente.next();

                            switch (tipoBuscaCliente) {
                                case "i":
                                    System.out.println();
                                    System.out.println("Apenas maiores de idade:\n");
                                    for (Cliente c : listaClientes.clientes) {
                                        if (c.idade >= 18) {
                                            c.exibir();
                                        }
                                    }
                                    break;

                                case "ii":
                                    System.out.println();
                                    Cliente auxClienteVelho = listaClientes.clientes.get(0);
                                    for (Cliente c : listaClientes.clientes) {
                                        if (c.idade < auxClienteVelho.idade) {
                                            auxClienteVelho = c;
                                        }
                                    }

                                    System.out.println("O cliente mais jovem tem: " + auxClienteVelho.idade + " anos.");
                                    auxClienteVelho.exibir();

                                    break;

                                case "iii":
                                    System.out.println();

                                    int quantIdosos = 0;

                                    for (Cliente c : listaClientes.clientes) {
                                        if (c.idade > 60) {
                                            quantIdosos++;
                                        }
                                    }

                                    System.out.println("A quantidade de clientes com idade maior que 60 é: " + quantIdosos);
                                    break;

                                case "iv":
                                    System.out.println();

                                    int quantMenoresIdade = 0;

                                    for (Cliente c : listaClientes.clientes) {
                                        if (c.idade < 18) {
                                            quantMenoresIdade++;
                                        }
                                    }

                                    System.out.println("A quantidade de clientes com idade menor que 18 é: " + quantMenoresIdade);
                                    break;

                                case "v":
                                    System.out.println();

                                    double mediaIdade = 0;

                                    for (Cliente c : listaClientes.clientes) {
                                        mediaIdade += c.idade;
                                    }

                                    System.out.println("A média de idades dos clientes é: " + mediaIdade / listaClientes.clientes.size());
                                    break;
                            }
                            break;

                        //INFORMACOES DOS PRODUTOS
                        case 2:
                            System.out.println();
                            System.out.println("Você escolheu Produtos! Agora defina:");
                            System.out.println("i - Produto mais caro");
                            System.out.println("ii - Produto mais barato");
                            System.out.println("iii - Média de preço dos produtos");
                            System.out.println("iv - Quantidade de produtos com preço acima da média");

                            Scanner scannerBuscaProduto = new Scanner(System.in);
                            String tipoBuscaProduto = scannerBuscaProduto.next();

                            switch (tipoBuscaProduto) {
                                case "i":
                                    System.out.println();
                                    Produto auxProdutoCaro = listaProdutos.produtos.get(0);
                                    for (Produto p : listaProdutos.produtos) {
                                        if (p.preco > auxProdutoCaro.preco) {
                                            auxProdutoCaro = p;
                                        }
                                    }

                                    System.out.println("O produto mais caro custa: R$" + auxProdutoCaro.preco);
                                    auxProdutoCaro.exibir();
                                    break;

                                case "ii":
                                    System.out.println();
                                    Produto auxProdutoBarato = listaProdutos.produtos.get(0);
                                    for (Produto p : listaProdutos.produtos) {
                                        if (p.preco < auxProdutoBarato.preco) {
                                            auxProdutoBarato = p;
                                        }
                                    }

                                    System.out.println("O produto mais barato custa: R$" + auxProdutoBarato.preco);
                                    auxProdutoBarato.exibir();
                                    break;

                                case "iii":
                                    System.out.println();

                                    double mediaPreco = 0;

                                    for (Produto p : listaProdutos.produtos) {
                                        mediaPreco += p.preco;
                                    }

                                    System.out.println("A média de preços dos produtos é: R$" + mediaPreco / listaProdutos.produtos.size());
                                    break;

                                case "iv":
                                    System.out.println();

                                    int quantAcimaMedia = 0;
                                    double media = 0;

                                    for (Produto p : listaProdutos.produtos) {
                                        media += p.preco;
                                    }

                                    media = media / listaProdutos.produtos.size();

                                    for (Produto p : listaProdutos.produtos) {
                                        if (p.preco > media) {
                                            quantAcimaMedia++;
                                        }
                                    }
                                    System.out.println("A quantidade de produtos acima de R$" + media + "(média de preço) é: " + quantAcimaMedia);

                                    break;
                            }
                            break;
                    }
            }
        }
    }
}