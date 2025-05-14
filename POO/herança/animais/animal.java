package poo.herança.animais;

public class animal {
    String nome;
    
    public void comer(){
        System.out.printf("%s comeu\n", nome);
    }

    public void beber(){
        System.out.printf("%s bebeu\n", nome);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


}
