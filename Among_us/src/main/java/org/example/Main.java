package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Astrounauta[] ast = new Astrounauta[10];

        Tripulante t1 = new Tripulante("vermelho","Cleitin","nao","gato");
        Impostor i1 = new Impostor("ciano","nextage","chapeu","nao");



        System.out.println("Total de astronautas " + Astrounauta.cont);
        for (int i = 0; i < ast.length; i++){
            if(ast[i] == null){
                if(ast[i] instanceof Tripulante){
                    Tripulante tx = (Tripulante) ast[i];
                    tx.fazerMissao();
                    tx.reparar();
                    tx.reportar();
                    tx.mostaInfo();
                }
                if(ast[i] instanceof Impostor){
                    Impostor ix = (Impostor) ast[i];
                    ix.reparar();
                    ix.fazerMissao();
                    ix.executar();
                    ix.reportar();
                    ix.sabotarComunicacao();
                    ix.sabotarLuz();
                    ix.sabotarOxigenio();
                    ix.trancarPortas("laboratorio");
                    ix.usarVentoinha();
                    ix.mostaInfo();
                }
            }
        }
    }
}