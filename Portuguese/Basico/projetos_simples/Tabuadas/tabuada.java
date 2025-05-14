package portuguese.basico.projetos_simples.tabuadas;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero para a tabuada: ");
        int numero = input.nextInt();

        System.out.print("Informe o operador aretmético:\n+ --> soma\n- --> subtração\n* --> multiplicação\n/ --> divisão\n-->: ");
        char operador = input.next().charAt(0);


        for(int i = 0; i < 10; i++){

            if(operador == '+'){
                System.out.println(numero +" + "+(i + 1)+" = "+(numero + (i + 1)));
            }else if(operador == '-'){
                System.out.println(numero +" - "+(i + 1)+" = "+(numero - (i + 1)));
            }else if(operador == '*'){
                System.out.println(numero +" * "+(i + 1)+" = "+(numero * (i + 1)));
            }else if(operador == '/'){
                System.out.println(numero +" / "+(i + 1)+" = "+(numero / (i + 1)));
            }else{
                System.out.print("Erro, operador aritmético inválido!");
            }
            input.close();
        }
    }
    
}
