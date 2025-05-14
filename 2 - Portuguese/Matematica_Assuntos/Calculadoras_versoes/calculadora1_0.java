package projetos_simples;
import java.util.Scanner;

public class calculadora1_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Selecione o calculo:\n+ --> Soma\n - --> Subtração\n* --> multiplicação\n/ --> Dividindo\n-->: ");
        char selecionar_calculo = input.next().charAt(0);

        if (selecionar_calculo == '+'){
            System.out.print("Informe o primeiro valor: ");int valor1 = input.nextInt();
            System.out.print("Informe o segundo valor: ");int valor2 = input.nextInt();
            int resultado = valor1 + valor2;
            System.out.print(valor1 +" + "+ valor2+" = "+resultado);
        }else if (selecionar_calculo == '-'){
            System.out.print("Informe o primeiro valor: ");int valor1 = input.nextInt();
            System.out.print("Informe o segundo valor: ");int valor2 = input.nextInt();
            int resultado = valor1 - valor2;
            System.out.print(valor1 +" - "+ valor2+" = "+resultado);
        }else if (selecionar_calculo == '*'){
            System.out.print("Informe o primeiro valor: ");int valor1 = input.nextInt();
            System.out.print("Informe o segundo valor: ");int valor2 = input.nextInt();
            int resultado = valor1 * valor2;
            System.out.print(valor1 +" * "+ valor2+" = "+resultado);
        }else if (selecionar_calculo == '/'){
            System.out.print("Informe o primeiro valor: ");int valor1 = input.nextInt();
            System.out.print("Informe o segundo valor: ");int valor2 = input.nextInt();
            int resultado = valor1 / valor2;
            System.out.print(valor1 +" / "+ valor2+"="+resultado);
        }
        input.close();
    }
}
