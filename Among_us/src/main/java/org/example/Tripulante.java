package org.example;

public class Tripulante extends Astrounauta implements Missao{

    private int qtdMissoes = 0;

    public Tripulante(String cor, String nome, String skin, String pet) {
        super(cor, nome, skin, pet);
    }

    @Override
    public void reportar(){
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar(){
        System.out.println(getNome() + " fez um reparo");
    }

    @Override
    public void fazerMissao(){
        System.out.println(getNome() + " fez uma missao");
        qtdMissoes++;
    }
}
