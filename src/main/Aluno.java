package main;


public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private Plano plano;

    public Aluno(String nome, int idade, Plano plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public Plano getPlano() {
        return plano;
    }

    public void exibirAluno() {
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Plano: " + plano.getNome());
    }
}