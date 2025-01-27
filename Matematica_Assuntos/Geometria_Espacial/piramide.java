package Matematica_Assuntos.Geometria_Espacial;
import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir da piramide:\nAL ==> área lateral\nAB ==> área base\nV ==> volume\n==>: ");
        String formula = input.next().toUpperCase();

        if(formula.equals("AL")){
            System.out.print("Informe a base da piramide: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura da piramide: ");
            double altura = input.nextDouble();
            double area_lateral = (base * altura) / 2;
            System.out.printf("A área lateral da piramide é: %.2f", area_lateral);
        
        }else if(formula.equals("V")){
            System.out.print("Informe a area da base da piramide: ");
            double area_base = input.nextDouble();
            System.out.print("Informe a altura da piramide: ");
            double altura = input.nextDouble();
            double volume = (area_base * altura) / 3;
            System.out.printf("O volume da piramide é: %.2f"+volume);
        
        }else if(formula.equals("AB")){
            System.out.print("Informe a formula base a seguir:\nBQ --> base quadrada\nBR --> base retangular\nBT --> base triangular\n-->: ");
            String formula_base = input.next().toUpperCase();

            if(formula_base.equals("BQ")){
                System.out.print("Informe o lado da base quadrangular da piramide: ");
                double lado = input.nextDouble();
                double base_quadrada = lado * lado;
                System.out.printf("A base quadrangular da piramide é: %.2f", base_quadrada);
            
            }else if(formula_base.equals("BR")){
                System.out.print("Informe a largura da base retangular da piramide: ");
                double largura = input.nextDouble();
                System.out.print("Informe o comprimento da base retangular da piramide: ");
                double comprimento = input.nextDouble();
                double base_retangular = largura * comprimento;
                System.out.printf("A base retangular da piramide é: %.2f", base_retangular); 
            
            }else if(formula_base.equals("BT")){
                System.out.print("Informe a base triangular da piramide: ");
                double base = input.nextDouble();
                System.out.print("Informe a altura triangular da piramide: ");
                double altura = input.nextDouble();
                double base_triangular = (base * altura) / 2;
                System.out.printf("A base triangular da piramide é: %.2f", base_triangular);
            }else{
                System.out.print("Erro, formua inválida!!");
            }
    }else{
        System.out.print("Erro, formula inválida!!");
    }
    input.close();
}
}
