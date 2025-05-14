package poo.listaserepeticao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class numeroposinega {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros_positivos = new ArrayList<>();
        List<Integer> numeros_negativos = new ArrayList<>();

        try{
        System.out.print("Informe a quantidade de números: ");
        int quan_numero = input.nextInt();

            for(int i = 0; i <= quan_numero; i++) {
                System.out.print("informe o "+(i + 1) +"° valor: ");
                int numero = input.nextInt();

                if(numero >= 0){
                    numeros_positivos.add(numero);
                }else if(numero < 0){
                    numeros_negativos.add(numero);
                }
            }
        }   catch(Exception  e) {
		        System.out.println("Erro, numero inválido! programa finalizado!");
                return;
        }   finally{
                input.close();
        }

    System.out.println("Lista positivos: "+numeros_positivos);
    System.out.println("Lista negativos: "+numeros_negativos);
    }  
}
