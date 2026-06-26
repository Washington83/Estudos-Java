package Heranca;

import Heranca.animais.Cachorro;
import Heranca.animais.Dragao;
import Heranca.animais.Gato;
import Heranca.animais.Pombo;

public class App {
    static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo");
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Snowbell");
        gato.miar();

        Dragao dragao = new Dragao("Dragão branco de olhos azuis");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombinha = new Pombo("Pombo Correio Sadex");
        pombinha.voar();
        pombinha.enviarCarta();
        pombinha.fazerPru();

    }
}
