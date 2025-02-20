package encapsulamento.pessoa;

public class Pessoa {
    private String nome;
	    private int idade;
        
        public String getnome() {
            return nome;
        }
        
        public void setnome(String nome) {
            this.nome = nome;
        }
        
        public int getidade() {
            return idade;
        }
        
        public void setidade(int idade) {
            if (idade > 0) {
                this.idade = idade;
            }else {
                System.out.print("Idade inválida!");
            }
        }
    
}
