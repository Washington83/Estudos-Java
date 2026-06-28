package HerancaPt2;

import HerancaPt2.Jogo.Arqueiro;
import HerancaPt2.Jogo.Personagem;

public class App {
    static void main(String[] args) {
        /*
            Classe Object + toString + implicito e explicito
            Sobescrita de métodos (+ exemplos)
            Método super
            Modificadores sem acesso
         */

        Arqueiro arqueiro = new Arqueiro("Legolas");
        System.out.println(arqueiro);

        arqueiro.atacar();
        arqueiro.atacarSemArma();
    }
}
