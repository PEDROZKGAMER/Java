import java.util.Scanner;

public class Paralelograma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> perimetro\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe a base do paralelograma: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do paralelograma: ");
            double altura = input.nextDouble();
            double area = base * altura;
            System.out.printf("A área do paralelograma é: %.2f",area);
        
        }else if(formula.equals(2)){
            System.out.print("Informe a base do paralelograma: ");
            double base = input.nextDouble();
            System.out.print("Informe o lado do paralelograma: ");
            double lado = input.nextDouble();
            double perimetro = 2 * (base + lado);
            System.out.printf("O perímetro do paralelograma é: %.2f",perimetro);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        }catch(Exception e){
            System.out.print("Só pode número!");
        }
        input.close();
    }    
}
