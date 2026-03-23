package main;

public class Plano {
    private int id;
    private String nome;
    private double valor;

    public Plano(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void exibirPlano() {
        System.out.println("Plano: " + nome);
        System.out.printf("Valor: R$ %.2f\n", valor);
    }
}