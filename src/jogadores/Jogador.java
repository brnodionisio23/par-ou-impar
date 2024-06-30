package jogadores;

import java.util.Scanner;

public class Jogador {
    Scanner sc = new Scanner(System.in);

    public String lado(){
        String lado = sc.next();
        return lado;
    }

    public int valor(){
        int valor = sc.nextInt();
        return valor;
    }
}
