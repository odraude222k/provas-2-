package org.example;

public abstract class Soldado {
    static int qtdsoldado = 0;
    private String nome;
    private long cpf;
    private Item item;

    public Item getItem() {
        return item;
    }

    public String getNome() {
        return nome;
    }

    public Soldado(String nome, long cpf, Item item) {
        this.nome = nome;
        this.cpf = cpf;
        this.item = item;
        qtdsoldado++;
    }

    public Soldado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        qtdsoldado++;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
    }

    public void usandoItem(){
        if(item == null){
            System.out.println(this.nome + "Nao tem especial para usar");
        } else {
            System.out.println(this.nome + "Utilizando item especial");
        }
    }
}
