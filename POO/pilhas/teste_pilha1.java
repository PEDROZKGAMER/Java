package poo.pilhas;
import java.util.Stack;

public class teste_pilha1 {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();
		
		carros.push("HIV");
		carros.push("golfe");
		carros.push("Citroem");
		carros.push("HB20");
		
		//System.out.println("Topo da pilha: "+carros.peek());
		//System.out.println("Remove ou tira da pilha o item: "+carros.pop());
		//System.out.println("Indentificar se a pilha esta vazia: "+carros.empty());
		System.out.println(carros);
    }
}
