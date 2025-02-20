package Matematica_Assuntos.Geometria_Espacial;
import java.util.Scanner;

public class cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula cone a seguir:\nAB ==> área da base\nAL ==> area lateral\nAT ==> area total\nV ==> volume\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("AB")){
            System.out.print("Informe o raio do cone: ");
            double raio = input.nextDouble();
            double area_base = 3.14 * (raio * raio);
            System.out.printf("A area da base do cone: %.2f",area_base);
        
        }else if(formula.equals("AL")){
            System.out.print("Informe o raio do cone: ");
            double raio = input.nextDouble();
            System.out.print("Informe a geratriz do cone: ");
            double geratriz = input.nextDouble();
            double area_lateral = (3.14 * (raio * geratriz));
            System.out.printf("A área lateral do cone é: %.2f", area_lateral);
        
        }else if(formula.equals("AT")){
            System.out.print("Informe o raio do cone: ");
            double raio = input.nextDouble();
            System.out.print("Informe a geratriz do cone: ");
            double geratriz = input.nextDouble();
            double area_total = (3.14 * (raio * raio)) + (3.14 * (raio * geratriz));
            System.out.printf("A área total do cone: %.2f",area_total);

        }else if(formula.equals("V")){
            System.out.print("Informe o raio do cone: ");
            double raio = input.nextDouble();
            System.out.print("Informe a altua do cone: ");
            double altura = input.nextDouble();
            double volume = (1.0 / 3.0) * (3.14 * (raio * raio) * altura);
            System.out.printf("O volume do cone é: %.2f",volume);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }
}
