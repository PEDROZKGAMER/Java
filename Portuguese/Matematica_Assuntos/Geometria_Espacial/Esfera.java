import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> volume\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("informe o raio da esfera: ");
            double raio = input.nextDouble();
            double area = 4 * (3.14 * (raio * raio));
            System.out.printf("A área da esfera é: %.2f", area);
        
        }else if(formula.equals(2)){
            System.out.print("Informe o raio da esfera: ");
            double raio = input.nextDouble();
            double volume = (4.0 / 3.0) * 3.14 * Math.pow(raio, 3);
            System.out.printf("O volume da esfera é: %.2f", volume);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
    }catch(Exception e){
        System.out.print("Só pode número!!");
    }
        input.close();
    }
}
