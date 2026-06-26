package Heranca.animais;

// Gato -> sublclasse
// Animal -> superclasse (classe mãe/pai)
public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    public void miar(){
        System.out.printf("%s miou\n", getNome());
    }
}
