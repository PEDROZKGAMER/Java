package Matematica_Assuntos.Geometria_Plana;
import java.util.Scanner;

public class circunferencia_circulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        
        System.out.print("Informe a formula a seguir:\nA ==> área\nP ==> perímetro\nD ==> diametro\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("A")){
            System.out.print("Informe o raio do circulo: ");
            double raio = input.nextDouble();
            double area = 3.14 * (raio * raio);
            System.out.printf("A área da circunferencia é: %.2f", area);
        
        }else if(formula.equals("P")){
            System.out.print("Informe o raio do circulo: ");
            double raio = input.nextDouble();
            double perimetro = 2 * 3.14 * raio;
            System.out.printf("O perimetro do circulo é: %.2f",perimetro);
        
        }else if(formula.equals("D")){
            System.out.print("Informe o raio do circulo: ");
            double raio = input.nextDouble();
            double diametro = 2 * raio;
            System.out.printf("O diametro do circulo é: %.2f",diametro);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }
    
}
