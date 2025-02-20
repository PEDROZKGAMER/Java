package ListaseRepeticao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class letras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> vogais = new ArrayList<>();
        List<Character> consoantes = new ArrayList<>();

        System.out.print("Informe a quantidade de letras: ");
        int quan_letras = input.nextInt();

        for(int i = 0; i < quan_letras; i++){
            System.out.print("Informe a "+(i + 1)+"° letra: ");
            char letra = input.next().toUpperCase().charAt(0);

            
                if(Character.isLetter(letra)){
                if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                    vogais.add(letra);
                }else{
                    consoantes.add(letra);
                }
            }else{
                System.out.print("Erro, letra inválida!");
                input.close();
                return;
            }
            
    }
    System.out.println("Lista de vogais: "+vogais);
    System.out.println("Lista de consoantes: "+consoantes);
    input.close();
}
}
