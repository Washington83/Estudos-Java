package HerancaPt2.Jogo;

public class Arqueiro extends Personagem{
    private String arma;


    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString(){
        String informacaoPersonagem = super.toString();
        String informacaoArqueiro = String.format(" - Arma: %s", arma);
        String resultado = informacaoPersonagem + informacaoArqueiro;
        return resultado;
    }


    @Override
    public void atacarComArma(){
        System.out.println("O arqueiro atacou com " + arma);
    }

}
