import java.util.Scanner;
public class calculadora3_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double resultado = 0;

        System.out.print("Informe o numero: ");
        resultado = input.nextDouble();

        while (true) {
            System.out.print("Informe o operador: ");
            String operador = input.next().toUpperCase();

            if(operador.equals("OK")){
                System.out.print("Codigo finalizado!!\n");
                break;
            }

            if(!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")){
                System.out.print("Erro, operador inválido. Tente novamente!");
                continue;
            }

            System.out.print("Informe o numero: ");
            double numero = input.nextDouble();

            if(operador.equals("+")){
                resultado += numero;
            }else if(operador.equals("-")){
                resultado -= numero;
            }else if(operador.equals("*")){
                resultado *= numero;
            }else if(operador.equals("/")){
                resultado /= numero;
            }

            System.out.println("O resultado parcial é: "+ resultado+"\n");
        }
        System.out.print("O resultado final foi: "+ resultado);
        input.close();
    }
    
}
