package org.example;

public class MedicoMilitar extends Soldado implements Curar {
    private int anosExperiencia;
    private int capacidadedeEmergencia;

    public MedicoMilitar(String nome, long cpf, Item item, int anosExperiencia, int capacidadedeEmergencia) {
        super(nome, cpf, item);
        this.anosExperiencia = anosExperiencia;
        this.capacidadedeEmergencia = capacidadedeEmergencia;
        if (getItem() != null){
            capacidadedeEmergencia += 100;
        }
    }

    public MedicoMilitar(String nome, long cpf, int anosExperiencia, int capacidadedeEmergencia) {
        super(nome, cpf);
        this.anosExperiencia = anosExperiencia;
        this.capacidadedeEmergencia = capacidadedeEmergencia;
    }



    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Anos de experiencia " + this.anosExperiencia);
        System.out.println("Capacidade de emergencia " + this.capacidadedeEmergencia);
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
    public void curar() {
        if (capacidadedeEmergencia > 920){
            System.out.println(this.getNome() + " curou alguem");
        } else {
            System.out.println(this.getNome() + " nao conseguiu curar");
        }
    }



}
