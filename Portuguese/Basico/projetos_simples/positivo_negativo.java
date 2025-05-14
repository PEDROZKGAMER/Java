package portuguese.basico.projetos_simples;

import java.util.Scanner;

public class positivo_negativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Informe o número: ");
            int numero = input.nextInt();

            if (numero >= 0) {
                System.out.println("É número positivo!");
            } else {
                System.out.println("É número negativo!");
            }
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } finally {
            input.close(); // Fecha o Scanner para evitar vazamento de recursos
        }
    }
}
