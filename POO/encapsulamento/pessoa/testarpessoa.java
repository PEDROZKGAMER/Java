package poo.encapsulamento.pessoa;

public class testarpessoa {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa();

        pessoa.setnome("Pedro");
        pessoa.setidade(18);

        System.out.println("O nome da pessoa é: "+ pessoa.getnome());
        System.out.println("A idade da pessoa é: "+ pessoa.getidade());
    }
    
}
