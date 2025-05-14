import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> perímetro\n3 ==> diametro\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe o raio do circulo: ");
            double raio = input.nextDouble();
            double area = 3.14 * (raio * raio);
            System.out.printf("A área da circunferencia é: %.2f", area);
        
        }else if(formula.equals(2)){
            System.out.print("Informe o raio do circulo: ");
            double raio = input.nextDouble();
            double perimetro = 2 * 3.14 * raio;
            System.out.printf("O perimetro do circulo é: %.2f",perimetro);
        
        }else if(formula.equals(3)){
            System.out.print("Informe o raio do circulo: ");
            double raio = input.nextDouble();
            double diametro = 2 * raio;
            System.out.printf("O diametro do circulo é: %.2f",diametro);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        }catch(Exception e){
            System.out.print("Só pode número!");
        }
        input.close();
    }
}
