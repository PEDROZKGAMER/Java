package portuguese.basico.projetos_simples.maior_de_idades;
import java.util.Scanner;

public class pode_votar_ou_nao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();

        if(idade >= 16){
            System.out.print("Você já pode votar!");
        }else{
            System.out.print("Não pode votar!!");
        }
        input.close();
    }
    
}
