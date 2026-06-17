package Metodos;

import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // void -> significa qu enão esta retornando nada
    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força\n", nome, nivel, forca);
    }
    int calcularDano(){
        Random gerador = new Random();
        // 1...20;
        // nextInt(): 0....1;        // nextInt(): 0 => 20       int dado20Faces = 1 + gerador.nextInt(19);
        int dado20Faces = 0;
        int dano = forca + dado20Faces;
        return dano;
    }
    // Metodo que não retorna nada e recebe um parâmetro alvo que é do tipo
    int danoCausado = calcularDano();
    void atacar(String alvo, String habilidade){
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
        }
    }
}
