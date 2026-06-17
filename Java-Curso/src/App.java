public class App {
    public static void main(String[] args) {
        // Iphone 12, tela de 6.1", 256gb
        // Galaxy Note 20 Ultra, tela de 6.9", 256gb
        // Xiomi 11 Pro, tela de 6.8", 128gb
        // <tipoVariavel> nomeVariavel = valor;

        /* Declarando um Objeto do tipo Celular = Instanciando um Objeto */
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();
        celularB.nome = "Xiomi MI 11";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Samsung Galaxy Note 20 Ultra";
        celularC.tamanhoTela = 6.9f;
        celularC.espacoArmazenamento = 256;
        celularC.sistemaOperacional = "Android";


        // "Celular " + celularA.nome + " com tela de " + celularA.tamanhoTela + ", com %d e SO %s"
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }
}