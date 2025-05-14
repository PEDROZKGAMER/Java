package portuguese.basico.projetos_simples.medias_dos_alunos;
import java.util.Scanner;

public class media_aluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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
    }
}
