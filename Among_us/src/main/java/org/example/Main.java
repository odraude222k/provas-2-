package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave();

        Tripulante t1 = new Tripulante("vermelho","Cleitin","nao","gato");
        Impostor i = new Impostor("ciano","nextage","chapeu","nao");

        nave.addAstronauta(t1);
        nave.addAstronauta(i);

        System.out.println("Total de astronautas " + Astrounauta.cont);

        nave.listarAstronautas();

    }
}