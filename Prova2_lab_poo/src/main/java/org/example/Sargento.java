package org.example;

public class Sargento extends Soldado implements Defesa{
    private String especializacao;
    private int experienciaCombate;

    public Sargento(String nome, long cpf, Item item, String especializacao, int experienciaCombate) {
        super(nome, cpf, item);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate) {
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especializacao" + this.especializacao);
        System.out.println("Experiencia em combate " + this.experienciaCombate);
    }

    @Override
    public void usandoItem(){
        if(getItem() == null){
            System.out.println(this.getNome() + "Nao tem especial para usar");
        } else {
            System.out.println(this.getNome() + "Utilizando item especial");
            experienciaCombate += 300;
        }
    }

    @Override
    public void defender() {
        if (experienciaCombate > 650){
            System.out.println(this.getNome() + " Conseguiu se defender");
        } else {
            System.out.println(this.getNome() + " nao se defendeu");
        }
    }
}



