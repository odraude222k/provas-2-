package org.example;

public class Nave {
    Astrounauta[] ast = new Astrounauta[10];

    public void addAstronauta(Astrounauta astrounauta){
        for (int i = 0; i < ast.length; i++){
            if(ast[i] == null){
                ast[i] = astrounauta;
                break;
            }
        }
    }

    public void listarAstronautas(){
        for (int i = 0; i < ast.length; i++){
            if(ast[i] != null){
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
