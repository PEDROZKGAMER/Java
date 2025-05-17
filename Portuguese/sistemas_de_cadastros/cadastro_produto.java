package portuguese.sistemas_de_cadastros;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cadastro_produto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> Produtos = new ArrayList<>();

        while(true){
            System.out.print("Informe a opção abaixo:\n1 ==> Cadastrar produto\n2 ==> Ver lista\n==> ");
            Integer opcao = input.nextInt();

            if(opcao.equals(1)){
                boolean Continuar_cadastrando = true;
                while(Continuar_cadastrando) {
                    input.nextLine();

                    System.out.print("Informe o nome do fornecedor: ");
                    String nome_fornecedor = input.nextLine();

                    if(nome_fornecedor.isEmpty()){
                        System.out.print("Nome não digitado ou inválido!");
                        continue;
                    }

                    System.out.print("Informe o nome do produto: ");
                    String nome_produto = input.nextLine();

                    if(nome_produto.isEmpty()){
                        System.out.print("Nome do produto não digitado ou inválido!");
                        continue;
                    }

                    System.out.print("Informe o preço do produto: ");
                    double preco = input.nextDouble();

                    if(preco < 0){
                        System.out.println("O preço do produto inválido!");
                    }

                    System.out.print("Informe a quantidade desse produto: ");
                    int quantidade = input.nextInt();

                    if(quantidade < 0){
                        System.out.println("A quantidade inválida!");
                        continue;
                    }

                    boolean saindo = true;
                    while(saindo) {
                        System.out.print("Deseja cadastrar esse produto? (S/N): ");
                        String confirmar = input.next().toUpperCase();

                        if (confirmar.equals("S")) {
                            System.out.println("Produto cadastrado!");
                            Produtos.add(nome_fornecedor + "|" + nome_produto + "|" + preco + "|" +quantidade);
                        } else if (confirmar.equals("N")) {
                            System.out.println("Produto não cadastrado!");
                        } else {
                            System.out.println("Opção inválida!");
                            continue;
                        }
                        while(true) {
                            System.out.print("Deseja cadastrar outro produto? (S/N): ");
                            String cadastra_outro = input.next().toUpperCase();

                            if (cadastra_outro.equals("S")) {
                                saindo = false;
                                break;
                            } else if (cadastra_outro.equals("N")) {
                                System.out.println("Voltando pro menu anterior!");
                                saindo = false;
                                Continuar_cadastrando = false;
                                break;
                            } else {
                                System.out.println("Opção inválida!");
                                continue;
                            }
                        }
                    }
                }
            }else if(opcao.equals(2)){
                if(Produtos.isEmpty()){
                    System.out.println("Nenhum produto cadastrado ainda!");
                }else{
                    System.out.println("Lista dos produtos cadastrados");
                    int valor_produto = 1;
                        for(String item : Produtos){
                            String[] partes = item.split("\\|");
                            String fornecedor = partes[0];
                            String produto = partes[1];
                            String preco = partes[2];
                            String quantidade = partes[3];
                            System.out.println("Produto #"+valor_produto+"\n\nFornecedor: "+ fornecedor +"\nProduto: "+produto+"\nPreço: "+preco+"\nQuantidade: "+quantidade+"\n");
                            valor_produto += 1;
                        }

                    }
                
            }
            input.close();
        }
    }
}