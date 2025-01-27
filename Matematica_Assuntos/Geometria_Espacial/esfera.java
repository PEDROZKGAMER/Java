package Matematica_Assuntos.Geometria_Espacial;
import java.util.Scanner;
import java.lang.Math;

public class esfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\nA ==> área\nV ==> volume\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("A")){
            System.out.print("informe o raio da esfera: ");
            double raio = input.nextDouble();
            double area = 4 * (3.14 * (raio * raio));
            System.out.printf("A área da esfera é: %.2f", area);
        
        }else if(formula.equals("V")){
            System.out.print("Informe o raio da esfera: ");
            double raio = input.nextDouble();
            double volume = (4.0 / 3.0) * 3.14 * Math.pow(raio, 3);
            System.out.printf("O volume da esfera é: %.2f", volume);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }
    
}
