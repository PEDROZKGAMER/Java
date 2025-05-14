package portuguese.basico.projetos_simples;
import java.util.Scanner;

public class salario_mes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("informe o valor que você ganha por hora: ");
        
        float valor_por_hora = input.nextFloat();
        
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        float valor_mes = input.nextFloat();
        
        float salario = valor_por_hora * valor_mes;
    if (valor_por_hora <= 0 || valor_mes <= 0) {
        System.out.print("Erro, salario inválido...");
    }else {
        System.out.print("O seu salario é "+ salario);
    }
input.close();
    }
    
}
