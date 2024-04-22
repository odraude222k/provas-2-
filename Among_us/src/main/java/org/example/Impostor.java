package org.example;

public class Impostor extends Astrounauta implements Missao, Sabotar, Executar{

    private int qtdMortes = 0;

    public Impostor(String cor, String nome, String skin, String pet) {
        super(cor, nome, skin, pet);
    }

    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilacao");
    }

    public void trancarPortas(String local){
        System.out.println(" O impostor trancou as portas do(a) " + local);
    }

    @Override
    public void reportar(){
        System.out.println(getNome() + " fez um self-report");
    }

    @Override
    public void reparar(){
        System.out.println(getNome() + "fingiu que fez um reparo");
    }
    // impostor disfarcando
    @Override
    public void fazerMissao(){
        System.out.println(getNome() + " fez uma tarefa falsa");
    }
    // acoes do impostor sabotar
    @Override
    public void sabotarLuz(){
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio(){
        System.out.println("O impostor sabotou o oxigenio");
    }

    @Override
    public void sabotarReator(){
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao(){
        System.out.println("O impostor sabotou a comunicacao");
    }

    // acoes executar
    @Override
    public void executar(){
        System.out.println(getNome() + " matou um tripulante");
        qtdMortes++;
    }
}
