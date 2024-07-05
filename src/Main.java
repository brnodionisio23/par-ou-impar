import game.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        String novaPartida = "s";

        System.out.println("*** PAR OU IMPAR ***");
        System.out.println(" ");

        while (novaPartida.equals("s")) {
            game.match();
            System.out.println("Deseja realizar nova partida? [S / N]");
            novaPartida = sc.next().toLowerCase();
        }
    }
}