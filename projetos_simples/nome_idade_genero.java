package projetos_simples;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class nome_idade_genero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Integer> idades = new ArrayList<>();
        List<Character> generos = new ArrayList<>();

        System.out.print("Informe a quantidade de pessoas: ");
        int quan_pessoas = input.nextInt();

        int masculino = 0;
        int feminino = 0;

        for(int i = 0; i < quan_pessoas; i++){
            System.out.print("Informe o nome da pessoa: ");
            String nome = input.next();
            nomes.add(nome);
            
            System.out.print("Informe a idade de "+nome+": ");
            int idade = input.nextInt();
            
            System.out.print("Informe o genero de "+nome+":\nM --> Masculino\nF --> Feminino\n-->: ");
            char genero = input.next().toUpperCase().charAt(0);

            if (idade <= 0){
                System.out.print("Erro, idade inválida!");
                input.close();
                return;
            }else{
                idades.add(idade);
            }

            if (genero == 'M'){
                generos.add(genero);
                masculino += 1;
            }else if(genero == 'F'){
                generos.add(genero);
                feminino += 1;
            }else{
                System.out.print("Erro, genero inválido!!");
            }
        }
        System.out.println("A quantidade de genero masculino foi: "+ masculino);
        System.out.println("A quantidade de genero feminino foi: "+ feminino);

        System.out.println("A lista de pessoas: "+nomes);
        System.out.println("A lista de idades de cada um: "+idades);
        System.out.println("A lista de generos de cada um: "+generos);
        input.close();
    }
    
}
