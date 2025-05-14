import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quadrado {
    // Função para fatorar números em primos
    public static Map<Integer, Integer> fatorarPrimos(int num) {
        Map<Integer, Integer> fatores = new HashMap<>();
        int divisor = 2;

        while (num > 1) {
            while (num % divisor == 0) {
                fatores.put(divisor, fatores.getOrDefault(divisor, 0) + 1);
                num /= divisor;
            }
            divisor++;
        }

        return fatores;
    }

    // Função para calcular a diagonal
    public static String calcularDiagonal(int lado) {
        if (lado <= 0) {
            return "O valor inserido foi 0 ou inválido!";
        }

        // Cálculo da soma dos quadrados
        int formulaDiagonal1 = (lado * lado) + (lado * lado);

        // Fatoração do valor da soma dos quadrados
        Map<Integer, Integer> fatores = fatorarPrimos(formulaDiagonal1);
        StringBuilder dentroDaRaiz = new StringBuilder();
        int foraDaRaiz = 1;

        for (Map.Entry<Integer, Integer> entry : fatores.entrySet()) {
            int fator = entry.getKey();
            int potencia = entry.getValue();
            int pares = potencia / 2;
            int sobrou = potencia % 2;

            foraDaRaiz *= Math.pow(fator, pares);
            if (sobrou > 0) {
                if (dentroDaRaiz.length() > 0) {
                    dentroDaRaiz.append(" * ");
                }
                dentroDaRaiz.append(fator);
            }
        }

        // Retorna o resultado formatado
        if (dentroDaRaiz.length() > 0) {
            return String.format("D = %d√(%s)", foraDaRaiz, dentroDaRaiz);
        } else {
            return String.format("D = %d", foraDaRaiz);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a formula a seguir:\n1 ==> área\n2 ==> perimetro\n3 ==> diagonal\n==>: ");
        Integer formula = input.nextInt();

        if(formula.equals(1)){
            System.out.print("Informe o lado do quadrado: ");
            double lado = input.nextDouble();
            double area = lado * lado;
            System.out.printf("A área do quadrado é: %.2f",area);
        
        }else if(formula.equals(2)){
            System.out.print("Informe o lado do quadrado: ");
            double lado = input.nextDouble();
            double perimetro = 4 * lado;
            System.out.printf("O perímetro do quadrado é: %.2f",perimetro);
        
        }else if(formula.equals(3)){
            System.out.print("Informe o lado do quadrado: ");
            int lado = input.nextInt();
            String diagonal = calcularDiagonal(lado);
            System.out.print("A diagonal do quadrado é: "+diagonal);
        }else{
            System.out.print("Erro, formula inválida!!");
        }
        input.close();
    }
}
