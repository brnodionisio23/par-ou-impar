package game;

import players.Cpu;
import players.Player;

import java.util.Scanner;

public class Game {
    Player p1 = new Player();
    Cpu p2 = new Cpu();
    int p1Victories = 0;
    int p2Victories = 0;

    Scanner sc = new Scanner(System.in);

    public void match() {
        choosenPlayersSide();
        choosenPlayersValue();
        score(p1.getSide(), p1.getValue(), p2.getValue());
        System.out.println(p1Victories + " X " + p2Victories);
    }

    public void choosenPlayersSide() {
        System.out.print("Escolha um lado: Par ou Impar: ");
        String aux = sc.next().toLowerCase();

        while (!aux.equals("par") && !aux.equals("impar")) {
            System.out.println("Lado invalido!, escreva: [par] ou [impar]");
            aux = sc.next().toLowerCase();
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

    public int[] score(String p1Side, int p1Value, int p2Value) {
        p1Value = p1.getValue();
        p2Value = p2.getValue();
        p1Side = p1.getSide();

        if ((p1Value + p2Value) % 2 == 0) {
            if (p1Side.equals("par")) {
                p1Victories++;
                System.out.println("Você venceu!");
            } else {
                p2Victories++;
                System.out.println("O computador venceu!");
            }
        }
        return new int[]{p1Victories, p2Victories};
    }
}
