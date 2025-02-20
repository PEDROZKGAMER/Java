package Matematica_Assuntos.Geometria_Plana;
import java.util.Scanner;
import java.lang.Math;

public class losango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\nA ==> área\nP ==> perimetro\nD ==> diagonal\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("A")){
            System.out.print("Informe a diagonal maior: ");
            double diagonal_maior = input.nextDouble();
            System.out.print("Informe a diagonal menor: ");
            double diagonal_menor = input.nextDouble();
            double area = (diagonal_maior * diagonal_menor) / 2.0;
            System.out.printf("A área do losango é: %.2f",area);
        
        }else if(formula.equals("P")){
            System.out.print("informe o lado do losango: ");
            double lado = input.nextDouble();
            double perimetro = 4 * lado;
            System.out.printf("O perimetro do losango é: %.2f",perimetro);
        
        }else if(formula.equals("D")){
            System.out.print("Informe a diagonal maior: ");
            double diagonal_maior = input.nextDouble();
            System.out.print("Informe a diagonal menor: ");
            double diagonal_menor = input.nextDouble();
            double diagonal = Math.sqrt((Math.pow(diagonal_maior / 2.0, 2)) + (Math.pow(diagonal_menor / 2.0, 2)));
            System.out.printf("A diagonal do losango é: %.2f",diagonal);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }
    
}
