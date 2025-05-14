import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> perimetro\n3 ==> diagonal\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe a base do triangulo: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura do triangulo: ");
            double altura = input.nextDouble();
            double area = (base * altura) / 2.0;
            System.out.printf("A área do triangulo é: %.2f",area);
        
        }else if(formula.equals(2)){
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
    }catch(Exception e){
        System.out.print("Só pode número!");
    }
        input.close();
    }    
}
