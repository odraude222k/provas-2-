package org.example;

public class Ilha {
    Pessoa[] pessoas = new Pessoa[10];

    public void addPessoas (Pessoa pessoa){
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] == null){
                pessoas[i] = pessoa;
                break;
            }
        }
    }

    public void listarPessoas(){
        for(int i = 0; i < pessoas.length; i++){
            if (pessoas[i] != null){
                if(pessoas[i] instanceof Jogador){
                    Jogador jx = (Jogador) pessoas[i];
                    jx.comprarVbucks();
                    jx.fazMissao();
                    jx.gastarVbucks();
                    jx.recuperarVida();
                    jx.recuperarEscudo();
                    jx.mostraInfo();
                }
                if(pessoas[i] instanceof Bot){
                    Bot bx = (Bot) pessoas[i];
                    bx.fazMissao();
                    bx.passarMissao();
                    bx.mostraInfo();
                }
            }
        }
    }
}
