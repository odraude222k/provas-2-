package org.example;

public class Bot extends Pessoa implements Interacao{
    private boolean hostil;

    public Bot(String nome, boolean hostil) {
        super(nome);
        this.hostil = hostil;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if(hostil){
            System.out.println("Hostil");
        } else {
            System.out.println("Amigavel");
        }

    }

    @Override
    public void fazMissao(){
        if(hostil){
            System.out.println("Atrapalhou o jogador a fazer a missao");
        } else {
            System.out.println("Ajudou o jogador a fazer a missao");
        }
    }

    @Override
    public void passarMissao(){
        if(hostil){
            System.out.println("esse bot nao passa missoes");
        } else {
            System.out.println("esse bot passa missoes");
        }

    }
}
