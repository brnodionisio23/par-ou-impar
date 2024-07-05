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
        System.out.print("Escolha um lado: Par ou Impar: ");
        String aux = sc.next();

        while (!aux.equals("par") && !aux.equals("impar")) {
            System.out.println("Lado invalido!, escreva: [par] ou [impar]");
            aux = sc.next();
        }

        p1.setSide(aux);
        p2.setSide(aux);
        System.out.println("Computador: " + p2.getSide());
        System.out.println(" ");
    }

    public void choosenPlayersValue() {
        int aux = 0;
        boolean inputIsValid = false;

        while (!inputIsValid) {
            System.out.print("Digite um valor: ");
            if (sc.hasNextInt()) {
                aux = sc.nextInt();
                inputIsValid = true;
            } else {
                System.out.println("Valor inválido! Digite um número inteiro válido.");
                sc.next();
            }

            p1.setValue(aux);
            p2.setValue();
            System.out.println("Computador: " + p2.getValue());
            System.out.println(" ");
        }

    }
}
