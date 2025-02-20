package Matematica_Assuntos.Geometria_Plana;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\nA ==> área\nP ==> perimetro\nD ==> diagonal\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("A")){
            System.out.print("Informe a base do triangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do triangulo: ");
            double altura = input.nextDouble();
            double area = (base * altura) / 2.0;
            System.out.printf("A área do triangulo é: %.2f",area);
        
        }else if(formula.equals("P")){
            System.out.print("Informe o valor de a: ");
            double valor_a = input.nextDouble();
            System.out.print("Informe o valor de b: ");
            double valor_b = input.nextDouble();
            System.out.print("Informe o valor de c: ");
            double valor_c = input.nextDouble();
            double perimetro = valor_a + valor_b + valor_c;
            System.out.printf("O perimetro do triangulo é: %.2f",perimetro);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }    
}
