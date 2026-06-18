package InterfacesOO;

import InterfacesOO.classes.PingPong;
import InterfacesOO.classes.TiroAoAlvo;
import InterfacesOO.classes.Videogame;

public class App {
    static void main(String[] args) {
        // Encpsulamento
        Videogame xDevOne = new Videogame();
        xDevOne.ligar();
        xDevOne.jogar(new TiroAoAlvo());
        xDevOne.fechar();
    }
}