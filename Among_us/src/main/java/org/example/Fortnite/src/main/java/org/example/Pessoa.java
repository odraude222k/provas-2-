package org.example;

public abstract class Pessoa {
    public static int qtdPessoa = 0;
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        qtdPessoa++;
    }

    public void mostraInfo(){
        System.out.println(this.nome);
    }

    public abstract void fazMissao();
}
