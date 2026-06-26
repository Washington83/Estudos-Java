package Heranca.animais;

public class Animal{
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.printf("%s comeu \n", nome);
    }

    public void beber(){
        System.out.printf("%s comeu \n", nome);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
         this.nome = nome;
    }
}
