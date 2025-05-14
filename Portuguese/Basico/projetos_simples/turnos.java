package projetos_simples;
import java.util.Scanner;

public class turnos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("informe o seu turno:\nM --> Matutino\nV --> Vespertino\nN --> Noturno\n-->: ");
        char turno = input.next().toUpperCase().charAt(0);

        if(turno == 'M'){
            System.out.print("Matutino");
        }else if(turno == 'V'){
            System.out.print("Vespertino");
        }else if(turno == 'N'){
            System.out.print("Noturno");
        }else{
            System.out.print("Erro, turno inválido!");
        }
        input.close();
    }
    
}
