package projetos_simples;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class senhas_usuarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> usuarios = new ArrayList<>();
        List<String> senhas = new ArrayList<>();
        
        //Usuarios
        usuarios.add("Pedro");
        usuarios.add("Vando");
        usuarios.add("Pereira");
        //Senhas
        senhas.add("Pedrozkl");
        senhas.add("Vando.mesk");
        senhas.add("Perera.nunes");

        System.out.print("Informe seu usuario: ");
        String usuario = input.nextLine();

        System.out.print("Informe a sua senha: ");
        String senha = input.nextLine();

        if(usuarios.get(0).equals(usuario) && senhas.get(0).equals(senha)){
            System.out.print("Seja bem vindo de volta "+usuario+"!");
        }else if(usuarios.get(1).equals(usuario) && senhas.get(1).equals(senha)){
            System.out.print("Seja bem vindo de volta "+usuario+"!");
        }else if(usuarios.get(2).equals(usuario) && senhas.get(2).equals(senha)){
            System.out.print("Seja bem vindo de volta "+usuario+"!");
        }else{
            System.out.print("Erro, usuário ou senha incorreto!");
        }
        input.close();
    }
}
