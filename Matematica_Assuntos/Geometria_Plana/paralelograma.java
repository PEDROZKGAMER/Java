package Matematica_Assuntos.Geometria_Plana;
import java.util.Scanner;

public class paralelograma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\nA ==> área\nP ==> perimetro\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("A")){
            System.out.print("Informe a base do paralelograma: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do paralelograma: ");
            double altura = input.nextDouble();
            double area = base * altura;
            System.out.printf("A área do paralelograma é: %.2f",area);
        
        }else if(formula.equals("P")){
            System.out.print("Informe a base do paralelograma: ");
            double base = input.nextDouble();
            System.out.print("Informe o lado do paralelograma: ");
            double lado = input.nextDouble();
            double perimetro = 2 * (base + lado);
            System.out.printf("O perímetro do paralelograma é: %.2f",perimetro);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }    
}
