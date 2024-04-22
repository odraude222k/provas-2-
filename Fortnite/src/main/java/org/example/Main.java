package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ilha ilha = new Ilha();

        Jogador jogador1 = new Jogador("DUDU",1,false,75,50,"picareta","muito raro","pouco raro");
        Bot bot1 = new Bot("Jao", false);

        ilha.addPessoas(jogador1);
        ilha.addPessoas(bot1);

        ilha.listarPessoas();

    }
}