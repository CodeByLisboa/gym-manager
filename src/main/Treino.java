package main;

import java.time.LocalDate;

public class Treino {
    private int id;
    private String descricao;
    private LocalDate data;
    private Aluno aluno;

    public Treino(String descricao, LocalDate data, Aluno aluno) {
        this.descricao = descricao;
        this.data = data;
        this.aluno = aluno;
    }

    public void exibirTreino() {
        System.out.println("Treino: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Plano: " + aluno.getPlano().getNome());
    }
}