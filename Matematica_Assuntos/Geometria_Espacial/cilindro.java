package Matematica_Assuntos.Geometria_Espacial;
import java.util.Scanner;

public class cilindro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\nAB ==> área base\nAL ==> área lateral\nAT ==> área total\nV ==> volume\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("AB")){
            System.out.print("Informe o raio do cilindro: ");
            double raio = input.nextDouble();
            double area_base = 3.14 * (raio * raio);
            System.out.printf("A área da base do cilindro é: %.2f",area_base);
        
        }else if(formula.equals("AL")){
            System.out.print("Informe o raio do cilindro: ");
            double raio = input.nextDouble();
            System.out.print("Informe a altura do cilindro: ");
            double altura = input.nextDouble();
            double area_lateral = (2 * (3.14 * (raio * altura)));
            System.out.printf("A área lateral do cilindro é: ",area_lateral);
        
        }else if(formula.equals("AT")){
            System.out.print("Informe a base maior do cilindro: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a área lateral do cilindro: ");
            double area_lateral = input.nextDouble();
            double area_total = ((2 * base_maior) + area_lateral);
            System.out.printf("A area total do cilindro é: %.2f",area_total);
        
        }else if(formula.equals("V")){
            System.out.print("Informe a base maior do cilindro: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do cilindro: ");
            double altura = input.nextDouble();
            double volume = (3.14 * (altura * (base * base)));
            System.out.printf("O volume do cilindro é: %.2f",volume);
        
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }
}
