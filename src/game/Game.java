package game;

import players.Cpu;
import players.Player;

import java.util.Scanner;

public class Game {
    Player p1 = new Player();
    Cpu p2 = new Cpu();

    Scanner sc = new Scanner(System.in);

    public void match() {

    }

    public void choosenPlayersSide() {
        String aux = sc.next();

        while (!aux.equals("par") && !aux.equals("impar")) {
            System.out.println("Lado invalido!, escreva: [par] ou [impar]");
            aux = sc.next();
        }

        p1.setSide(aux);
        p2.setSide(aux);
    }

}

