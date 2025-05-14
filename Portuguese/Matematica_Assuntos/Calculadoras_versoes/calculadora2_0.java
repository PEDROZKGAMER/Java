package portuguese.matematica_assuntos.calculadoras_versoes;
import java.util.Scanner;

public class calculadora2_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int quantidade_numero = input.nextInt();

        System.out.print("Informe a operação matemática:\n+ --> soma\n- --> subtração\n* --> multiplicação\n/ --> divisão\n-->: ");
        String operador = input.next();

        int soma = 0;
        int subtracao = 0;
        int multiplicacao = 1;
        double divisao = 0.0;

        for (int i = 0; i < quantidade_numero; i++) {
            System.out.print("Informe o " + (i + 1) + "° valor: ");
            int numero = input.nextInt();

            // Operações
            if (operador.equals("+")) {
                soma += numero;
            } else if (operador.equals("-")) {
                if (i == 0) {
                    subtracao = numero;
                } else {
                    subtracao -= numero;
                }
            } else if (operador.equals("*")) {
                multiplicacao *= numero;
            } else if (operador.equals("/")) {
                if (i == 0) {
                    divisao = numero;
                } else {
                    if (numero == 0) {
                        System.out.println("Erro: divisão por zero.");
                        input.close();
                        return;
                    }
                    divisao /= numero;
                }
            } else {
                System.out.println("Operador inválido!");
                input.close();
                return;
            }
        }

        if (operador.equals("+")) {
            System.out.println("Resultado da soma: " + soma);
        } else if (operador.equals("-")) {
            System.out.println("Resultado da subtração: " + subtracao);
        } else if (operador.equals("*")) {
            System.out.println("Resultado da multiplicação: " + multiplicacao);
        } else if (operador.equals("/")) {
            System.out.println("Resultado da divisão: " + divisao);
        }
        input.close();
    }
}
