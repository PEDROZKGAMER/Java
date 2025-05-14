package portuguese.matematica_assuntos.geometria_espacial;
import java.util.Scanner;

public class Troncos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir:\n1 ==> tronco da piramide\n2 ==> tronco do cone\n3 ==> tronco do prisma\n4 ==> tronco do cilindro\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe a altura do tronco da piramide: ");
            double altura = input.nextDouble();
            System.out.print("Informe a base maior: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a base menor: ");
            double base_menor = input.nextDouble();
            double tronco_piramide = (altura / 3) * (base_maior + base_menor + Math.sqrt((base_maior * base_menor)));
            System.out.printf("O tronco da piramide é: %.2f",tronco_piramide);
         
        }else if(formula.equals(2)){
            System.out.print("Informe a altura do tronco do cone: ");
            double altura = input.nextDouble();
            System.out.print("Informe a raio maior: ");
            double raio_maior = input.nextDouble();
            System.out.print("Informe a raio menor: ");
            double raio_menor = input.nextDouble();
            double tronco_cone = (Math.PI * altura / 3) * (Math.pow(raio_maior, 2) + (raio_maior * raio_menor) + Math.pow(raio_menor, 2));
            System.out.printf("O tronco do cone é: %.2f",tronco_cone);
        
        }else if(formula.equals(3)){
            System.out.print("Informe a altura do tronco do prisma: ");
            double altura = input.nextDouble();
            System.out.print("Informe a base maior: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a base menor: ");
            double base_menor = input.nextDouble();
            double tronco_prisma = ((altura * base_maior) + base_menor) / 2.0;
            System.out.printf("O tronco do prisma é: %.2f",tronco_prisma);
        
        }else if(formula.equals(4)){
            System.out.print("Informe a altura do tronco do cilindro: ");
            double altura = input.nextDouble();
            System.out.print("Informe a raio maior: ");
            double raio_maior = input.nextDouble();
            System.out.print("Informe a raio menor: ");
            double raio_menor = input.nextDouble();
            double tronco_cilindro = (3.14 * altura) * ((raio_maior * raio_maior) + (raio_menor * raio_menor));
            System.out.printf("O tronco do cilindro é: %.2f",tronco_cilindro);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
    }catch(Exception e){
        System.out.print("Só pode número!");
    }
        input.close();
    }
}
