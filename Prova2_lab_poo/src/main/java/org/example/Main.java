package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exercito ex = new Exercito();

        Item item = new Item("Forca especial");


        Sargento sargento = new Sargento("Gabriel", 111111, item,"Sniper",100);
        MedicoMilitar med = new MedicoMilitar("Eduardo",22222,10,950);
        Oficial of = new Oficial("Matheus",33333,"Cabo");

        ex.addSoldado(sargento);
        ex.addSoldado(med);
        ex.addSoldado(of);

        ex.mostraInfo();

        System.out.println("quantiadade de soldados: " + Soldado.qtdsoldado);
    }
}