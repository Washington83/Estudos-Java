package InterfacesOO.classes;

public class Videogame {

    private boolean estaLigado; // false
    private Jogo jogo; // null

    public void ligar(){
        System.out.println("Ligando o videogame...");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo){
        if (estaLigado){
            System.out.println("Iniciando o jogo");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("Videogame está desligado!");
        }
    }

    public void fechar(){
        if (estaLigado){
          System.out.println("Fechando o jogo...");
          boolean temJogoRodando = jogo != null;
          if(temJogoRodando){
              jogo.fechar();
              jogo = null;
          } else {
              System.out.println("Não tem nenhum jogo rodando!");
          }
        } else {
            System.out.println("Videogame está desligado!");
        }
    }
}
