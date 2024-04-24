package org.example;

public class Oficial extends Soldado implements Defesa {
    private String patente;

    public Oficial(String nome, long cpf, Item item, String patente) {
        super(nome, cpf, item);
        this.patente = patente;
    }

    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Patente " + this.patente);
    }

    @Override
    public void usandoItem(){
        if(getItem() == null){
            System.out.println(this.getNome() + "Nao tem especial para usar");
        } else {
            System.out.println(this.getNome() + "Utilizando item especial");
        }
    }

    @Override
    public void defender() {
        if (getItem() == null){
            System.out.println(this.getNome() + " Nao se defendeu");
        } else {
            System.out.println(this.getNome() + " Conseguiu se defender");
        }
    }
}
