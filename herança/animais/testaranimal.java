package herança.animais;

public class testaranimal extends animal{
    public static void main(String[] args) {
        cachorro cao = new cachorro();

        cao.setNome("Spike");
        cao.beber();
        cao.comer();
        cao.lamber();
        System.out.println("");
        gato toby = new gato();
        toby.setNome("Toby");
        toby.miou();
        toby.beber();
        toby.comer();
    }
}
