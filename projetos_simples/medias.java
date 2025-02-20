package projetos_simples;
import java.util.Scanner;

public class medias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Olá, você é de qual ensino:\nC --> colégio\nF --> Faculdade\n-->: ");
        char selecionar = input.next().toUpperCase().charAt(0);

    if (selecionar == 'C'){
            double soma = 0;
        for (int i = 0; i < 4; i++){
            System.out.print("Informe a "+(i + 1)+"° média do aluno: ");
            double nota = input.nextDouble();
            soma += nota;

            if (nota >= 10.01){
                System.out.println("Erro, nota inválida!!");
                input.close();
                return;
            }
            if (nota < 0){
                System.out.println("Erro, nota inválida!!");
                input.close();
                return;
            }
        }
        double media = soma / 4;

        if(media >= 7.0){
            System.out.print("O aluno passou por média, a media final foi: "+ media);
        }else if(media >= 4.0 && media < 7.0){
            System.out.println("O aluno ficou na final! A sua média foi: "+ media);
        }else{
            System.out.println("O aluno ficou reprovado! A sua média foi: "+ media);
            input.close();
        }
    }else if(selecionar == 'F'){
        double soma = 0;
        for (int i = 0; i < 2; i++){
            System.out.print("Informe a "+(i + 1)+"° média do aluno: ");
            double nota = input.nextDouble();
            soma += nota;

            if (nota >= 10.01){
                System.out.println("Erro, nota inválida!!");
                input.close();
                return;
            }
            if (nota < 0){
                System.out.println("Erro, nota inválida!!");
                input.close();
                return;
            }
        }
        double media = soma / 2;

        if(media >= 7.0){
            System.out.print("O aluno passou por média, a media final foi: "+ media);
        }else if(media >= 4.0 && media < 7.0){
            System.out.println("O aluno ficou na final! A sua média foi: "+ media);
        }else{
            System.out.println("O aluno ficou reprovado! A sua média foi: "+ media);
            input.close();
        }
    }
        
    }
    
}
