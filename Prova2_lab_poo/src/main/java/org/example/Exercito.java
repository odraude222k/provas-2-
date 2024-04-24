package org.example;

public class Exercito {
    private String nome;
    private Soldado [] soldados;

    public Exercito() {
        this.soldados = new Soldado[10];
    }

    public void addSoldado(Soldado s){
        for (int i = 0; i < soldados.length; i++){
            if(soldados[i] == null){
                soldados[i] = s;
                break;
            }
        }
    }

    public void mostraInfo(){
        for(int i = 0; i < soldados.length; i++){
            if (soldados[i] != null){
                if(soldados[i] instanceof Sargento){
                    Sargento sx = (Sargento) soldados[i];
                    sx.defender();
                    sx.usandoItem();
                    sx.mostraInfo();
                }
                if(soldados[i] instanceof MedicoMilitar){
                    MedicoMilitar mx = (MedicoMilitar) soldados[i];
                    mx.usandoItem();
                    mx.curar();
                    mx.mostraInfo();
                }
                if(soldados[i] instanceof Oficial){
                    Oficial ox = (Oficial) soldados[i];
                    ox.defender();
                    ox.usandoItem();
                    ox.mostraInfo();
                }
            }
        }
    }
}
