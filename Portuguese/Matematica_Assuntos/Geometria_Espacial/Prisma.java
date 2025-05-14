package portuguese.matematica_assuntos.geometria_espacial;
import java.util.Scanner;

public class Prisma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir da piramide:\n1 ==> área\n2 ==> área total\n3 ==> área base\n4 ==> volume\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe o lado do prisma: ");
            double lado = input.nextDouble();
            System.out.print("Informe a altura do prisma: ");
            double altura = input.nextDouble();
            double area = lado * altura;
            System.out.printf("A área do prisma é: %.2f",area);
        
        }else if(formula.equals(2)){
            System.out.print("Informe a área base do prisma: ");
            double area_base = input.nextDouble();
            System.out.print("Informe a área lateral do prisma: ");
            double area_lateral = input.nextDouble();
            double area_total = area_base + (2 * area_lateral);
            System.out.printf("A área total do prisma é: %.2f",area_total);
        
        }else if(formula.equals(4)){
            System.out.print("Informe a área base do prisma: ");
            double area_base = input.nextDouble();
            System.out.print("Informe a altura do prisma: ");
            double altura = input.nextDouble();
            double volume = area_base * altura;
            System.out.printf("O volume do prisma é: %.2f",volume);
        
        }else if(formula.equals(3)){
            System.out.print("Informe a formula da base a seguir:\n1 ==> base triangular\n2 ==> base quadrado\n3 ==> base retangular\n4 ==> base hexagonal regular\n5 ==> base circular\n==>: ");
            Integer formula_base = input.nextInt();

            if(formula_base.equals(1)){
                System.out.print("Informe a base do prisma: ");
                double base = input.nextDouble();
                System.out.print("Informe a altura da base do prisma: ");
                double altura = input.nextDouble();
                double base_triangular = (base * altura) / 2;
                System.out.printf("A base triangular do prisma é: %.2f",base_triangular);
            
            }else if(formula_base.equals(2)){
                System.out.print("Informe o lado do prisma: ");
                double lado = input.nextDouble();
                double base_quadrado = lado * lado;
                System.out.printf("A base quadrangular do prisma é: %.2f",base_quadrado);
            
            }else if(formula_base.equals(3)){
                System.out.print("Informe a largura da base retangular do prisma: ");
                double largura = input.nextDouble();
                System.out.print("Informe o comprimento da base retangular do prisma: ");
                double comprimento = input.nextDouble();
                double base_retangular = largura * comprimento;
                System.out.printf("A base retangular do prisma é: %.2f", base_retangular); 
            
            }else if(formula_base.equals(4)){
                System.out.print("Informe a base circular do prisma: ");
                double raio = input.nextDouble();
                double base_circular = 3.14 * (raio * raio);
                System.out.printf("A base circular do prisma é: %.2f",base_circular);
            
            }else if(formula_base.equals(5)){
                System.out.print("Informe o lado da base hexagonal: ");
                double lado = input.nextDouble();
                double base_hexagonal = (((lado * lado) * 3) * Math.sqrt(3)) / 2.0;
                System.out.printf("A base hexagonal do prisma é: %.2f",base_hexagonal);
            }else{
                System.out.print("Erro, formula inválida!!");
            }
        }else{
            System.out.print("Erro, formula inválida!!");
        }
    }catch(Exception e){
        System.out.print("Só pode número!!");
    }
        input.close();
    }
}
