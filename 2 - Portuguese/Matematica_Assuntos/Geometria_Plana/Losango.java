import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> perimetro\n3 ==> diagonal\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe a diagonal maior: ");
            double diagonal_maior = input.nextDouble();
            System.out.print("Informe a diagonal menor: ");
            double diagonal_menor = input.nextDouble();
            double area = (diagonal_maior * diagonal_menor) / 2.0;
            System.out.printf("A área do losango é: %.2f",area);
        
        }else if(formula.equals(2)){
            System.out.print("informe o lado do losango: ");
            double lado = input.nextDouble();
            double perimetro = 4 * lado;
            System.out.printf("O perimetro do losango é: %.2f",perimetro);
        
        }else if(formula.equals(3)){
            System.out.print("Informe a diagonal maior: ");
            double diagonal_maior = input.nextDouble();
            System.out.print("Informe a diagonal menor: ");
            double diagonal_menor = input.nextDouble();
            double diagonal = Math.sqrt((Math.pow(diagonal_maior / 2.0, 2)) + (Math.pow(diagonal_menor / 2.0, 2)));
            System.out.printf("A diagonal do losango é: %.2f",diagonal);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        }catch(Exception e){
            System.out.print("Só pode número!");
        }
        input.close();
    }
}
