package ModificadoresDeAcesso;

public class ContaNetflix {
    private String idiomaPreferencial;
    String resolucaoTela;

    public void entrar(){
        buscarPreferenciasDoUsuario();
        indentificarResolucao();
    }
    private void buscarPreferenciasDoUsuario(){
        idiomaPreferencial = "PT-BR";
    }
    private void indentificarResolucao(){
        resolucaoTela = "Full HD";
    }
    void assistirFilme(String nomeFilme){
        System.out.println("Iniciando Filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução " + resolucaoTela);
        carregarAudioFilme();
    }
    private void carregarAudioFilme(){
        if(idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.println("Carregando o aúdio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando o aúdio em EN-US");
        }
    }
}