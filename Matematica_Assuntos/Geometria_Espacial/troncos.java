package Matematica_Assuntos.Geometria_Espacial;
import java.util.Scanner;
import java.lang.Math;

public class troncos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\nTP ==> tronco da piramide\nTC ==> tronco do cone\nTPR ==> tronco do prisma\nTCL ==> tronco do cilindro\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("TP")){
            System.out.print("Informe a altura do tronco da piramide: ");
            double altura = input.nextDouble();
            System.out.print("Informe a base maior: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a base menor: ");
            double base_menor = input.nextDouble();
            double tronco_piramide = (altura / 3) * (base_maior + base_menor + Math.sqrt((base_maior * base_menor)));
            System.out.printf("O tronco da piramide é: %.2f",tronco_piramide);
         
        }else if(formula.equals("TC")){
            System.out.print("Informe a altura do tronco do cone: ");
            double altura = input.nextDouble();
            System.out.print("Informe a raio maior: ");
            double raio_maior = input.nextDouble();
            System.out.print("Informe a raio menor: ");
            double raio_menor = input.nextDouble();
            double tronco_cone = (Math.PI * altura / 3) * (Math.pow(raio_maior, 2) + (raio_maior * raio_menor) + Math.pow(raio_menor, 2));
            System.out.printf("O tronco do cone é: %.2f",tronco_cone);
        
        }else if(formula.equals("TPR")){
            System.out.print("Informe a altura do tronco do prisma: ");
            double altura = input.nextDouble();
            System.out.print("Informe a base maior: ");
            double base_maior = input.nextDouble();
            System.out.print("Informe a base menor: ");
            double base_menor = input.nextDouble();
            double tronco_prisma = ((altura * base_maior) + base_menor) / 2.0;
            System.out.printf("O tronco do prisma é: %.2f",tronco_prisma);
        
        }else if(formula.equals("TCL")){
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
        input.close();
    }
}
