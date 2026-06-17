package Construtor;

public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String apelido;
    private boolean estaCadastrado;

    // Método construtor
    public Pessoa(String nome, int idade, float altura, float peso) {
        System.out.println("Uma pessoa acaba de nascer! Parabéns!");

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.apelido = "";
        this.estaCadastrado = false;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.format(
                "Nome: %s, Idade: %d anos, Altura: %.2f m, Peso: %.2f kg%n",
                nome,
                idade,
                altura,
                peso
        );
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public boolean isEstaCadastrado() {
        return estaCadastrado;
    }
    public void setEstaCadastrado(boolean estaCadastrado) {
        this.estaCadastrado = estaCadastrado;
    }
}