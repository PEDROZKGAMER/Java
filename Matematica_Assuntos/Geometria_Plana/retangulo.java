package Matematica_Assuntos.Geometria_Plana;
import java.util.Scanner;
import java.lang.Math;

public class retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\nA ==> área\nP ==> perimetro\nD ==> diagonal\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("A")){
            System.out.print("Informe a base do retangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do retangulo: ");
            double altura = input.nextDouble();
            double area = base * altura;
            System.out.printf("A área do retangulo é: %.2f",area);
        
        }else if(formula.equals("P")){
            System.out.print("Informe a base do retangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do retangulo: ");
            double altura = input.nextDouble();
            double perimetro = 2 * (base + altura);
            System.out.printf("O perímetro do retangulo é: %.2f",perimetro);
        
        }else if(formula.equals("D")){
            System.out.print("Informe a base do retangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do retangulo: ");
            double altura = input.nextDouble();
            double diagonal = Math.sqrt((base * base) + (altura * altura));
            System.out.printf("A diagonal do retangulo é: %.2f",diagonal);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }    
}
