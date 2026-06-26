package Heranca.animais;

public class Cachorro extends Animal{
    private int ossosComidos;

    public Cachorro(String nome){
        super("Cachorro"); // primeira linha -> contém a chamada do construtor da classe super
        this.ossosComidos = 10;
    }

     public void latir(){
         System.out.printf("%s latiu \n", getNome());
     }
     public void lamber(){
        System.out.printf("%s lambeu \n", getNome());
    }
}
