package portuguese.matematica_assuntos.geometria_espacial;
import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Informe a formula a seguir da piramide:\n1 ==> área lateral\n2 ==> área base\n3 ==> volume\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe a base da piramide: ");
            double base = input.nextDouble();
            System.out.print("Informe a altura da piramide: ");
            double altura = input.nextDouble();
            double area_lateral = (base * altura) / 2;
            System.out.printf("A área lateral da piramide é: %.2f", area_lateral);
        
        }else if(formula.equals(3)){
            System.out.print("Informe a area da base da piramide: ");
            double area_base = input.nextDouble();
            System.out.print("Informe a altura da piramide: ");
            double altura = input.nextDouble();
            double volume = (area_base * altura) / 3;
            System.out.printf("O volume da piramide é: %.2f"+volume);
        
        }else if(formula.equals(2)){
            System.out.print("Informe a formula base a seguir:\n1 --> base quadrada\n2 --> base retangular\n3 --> base triangular\n-->: ");
            Integer formula_base = input.nextInt();

            if(formula_base.equals(1)){
                System.out.print("Informe o lado da base quadrangular da piramide: ");
                double lado = input.nextDouble();
                double base_quadrada = lado * lado;
                System.out.printf("A base quadrangular da piramide é: %.2f", base_quadrada);
            
            }else if(formula_base.equals(2)){
                System.out.print("Informe a largura da base retangular da piramide: ");
                double largura = input.nextDouble();
                System.out.print("Informe o comprimento da base retangular da piramide: ");
                double comprimento = input.nextDouble();
                double base_retangular = largura * comprimento;
                System.out.printf("A base retangular da piramide é: %.2f", base_retangular); 
            
            }else if(formula_base.equals(3)){
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
}catch(Exception e){
    System.out.print("Só pode número!");
}
    input.close();
}
}
