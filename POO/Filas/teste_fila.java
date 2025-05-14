package poo.filas;
import java.util.LinkedList;
import java.util.Queue;

public class teste_fila {
    public static void main(String[] args) {
        Queue <String> carros = new LinkedList<>();
		
		carros.add("hb20");
		carros.add("Citroem");
		carros.add("Camaro");
		carros.add("Laborgine");
		
		System.out.println("Topo da fila: "+ carros.isEmpty());
		System.out.print(carros);
    }
    
}
