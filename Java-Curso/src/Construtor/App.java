package Construtor;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Nome do personagem");
        String classe = JOptionPane.showInputDialog(null, "Classe do Persoangem");

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();
    }
}