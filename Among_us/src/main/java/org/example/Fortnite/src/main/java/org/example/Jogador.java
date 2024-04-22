package org.example;

public class Jogador extends Pessoa implements Recuperar, Loja{
    private int nivel = 0;
    private boolean passeBatalha;
    private int vida;
    private int escudo;
    Skin skin;
    Mochila mochila;

    public Jogador(String nome, int nivel, boolean passeBatalha, int vida, int escudo, String skin, String rarosk, String mochila) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
        this.skin = new Skin(skin, rarosk);
        this.mochila = new Mochila(mochila);
    }




    public Jogador(String nome, int nivel, boolean passeBatalha, int vida, int escudo) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Nivel: " + this.nivel);
        if(passeBatalha){
            System.out.println("Possui passe");
        } else {
            System.out.println("Nao possui passe");
        }
        System.out.println("Vida: " + this.vida);
        System.out.println("Escudo: " + this.escudo);
        if(skin == null){
            System.out.println("Nao possui skin");
        } else {
            System.out.println("nome da skin: " + skin.getNome());
            System.out.println("radidade da skin: " + skin.getRaro());
        }
        if(mochila == null ){
            System.out.println("nao possui mochila");
        } else {
            System.out.println("radidade da mochila: " + mochila.getRaridade());
        }
    }

    @Override
    public void fazMissao(){
        System.out.println(this.nome + " completou uma missao!");
        nivel++;
    }

    @Override
    public void recuperarVida(){
        if(vida < 100){
            vida += 15;
        } else {
            vida = 100;
        }
    }

    @Override
    public void recuperarEscudo(){
        if(escudo < 100){
            escudo += 25;
        } else {
            escudo = 100;
        }
    }

    @Override
    public void gastarVbucks(){
        System.out.println("Gastou V bucks na loja");
    }

    @Override
    public void comprarVbucks(){
        System.out.println("Comprou V Bucks na loja");
    }

}
