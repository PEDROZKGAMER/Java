import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> perimetro\n3 ==> diagonal\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe a base maior: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a base menor: ");
            double base_menor = input.nextDouble();
            System.out.print("Informe a altura do trapézio: ");
            double altura = input.nextDouble();
            double area = ((base_maior + base_menor) * altura) / 2.0;
            System.out.printf("A área do trapézio: %.2f",area);
        
        }else if(formula.equals(2)){
            System.out.print("Informe a base maior: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a base menor: ");
            double base_menor = input.nextDouble();
            System.out.print("Informe o lado 1: ");
            double lado_1 = input.nextDouble();
            System.out.print("Informe o lado 2: ");
            double lado_2 = input.nextDouble();
            double perimetro = base_maior + base_menor + lado_1 + lado_2;
            System.out.printf("O perimetro do trapézio é: %.2f",perimetro);
        
        }else if(formula.equals(3)){
            System.out.print("Informe a base maior: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a base menor: ");
            double base_menor = input.nextDouble();
            double base_media = (base_maior * base_menor) / 2.0;
            System.out.printf("A base média do trapézio é: %.2f",base_media);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        }catch(Exception e){
            System.out.print("Só pode número!");
        }
        input.close();
    }
}
