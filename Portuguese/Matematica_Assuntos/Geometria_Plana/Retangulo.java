package portuguese.matematica_assuntos.geometria_plana;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> perimetro\n3 ==> diagonal\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe a base do retangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do retangulo: ");
            double altura = input.nextDouble();
            double area = base * altura;
            System.out.printf("A área do retangulo é: %.2f",area);
        
        }else if(formula.equals(2)){
            System.out.print("Informe a base do retangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do retangulo: ");
            double altura = input.nextDouble();
            double perimetro = 2 * (base + altura);
            System.out.printf("O perímetro do retangulo é: %.2f",perimetro);
        
        }else if(formula.equals(3)){
            System.out.print("Informe a base do retangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do retangulo: ");
            double altura = input.nextDouble();
            double diagonal = Math.sqrt((base * base) + (altura * altura));
            System.out.printf("A diagonal do retangulo é: %.2f",diagonal);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        }catch(Exception e){
            System.out.print("Só pode número!");
        }
        input.close();
    }    
}
