package poo.encapsulamento.pessoa;

public class testarpessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setnome("Pedro");
        pessoa.setidade(18);

        System.out.println("O nome da pessoa é: "+ pessoa.getnome());
        System.out.println("A idade da pessoa é: "+ pessoa.getidade());
    }
    
}
