package polimorfismo.animais;

public class testarnaimal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        System.out.print("Cachorro: ");
        animal = new cachorro();
        animal.fazerBarulho();

        System.out.print("Gato: ");
        animal = new gato();
        animal.fazerBarulho();
    }
    
}
