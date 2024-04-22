package org.example;

public abstract class Astrounauta {
    static int cont = 0;
    private String cor;
    private String nome;
    Skin skin;
    Pet pet;

    public String getNome() {
        return nome;
    }



    public Astrounauta(String cor, String nome, String skin, String pet) {
        this.cor = cor;
        this.nome = nome;
        this.skin = new Skin(skin);
        this.pet = new Pet(pet);
        cont++;
    }

    public void mostaInfo(){
        System.out.println(this.nome);
        System.out.println(this.cor);
        if(skin.getTipo().equals("nao")){
            System.out.println("Nao possui skin");
        }else {
            System.out.println("Tipo de skin: " + skin.getTipo());
        }
        if(pet.getNome().equals("nao")){
            System.out.println("Nao possui pet");
        }else {
            System.out.println("nome do pet: " + pet.getNome());
        }
    }

    public void verCameras(){
        System.out.println(this.nome + "Olhou as cameras");
    }

    public abstract void reportar();

    public abstract void reparar();

}
