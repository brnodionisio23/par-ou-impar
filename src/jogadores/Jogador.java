package jogadores;

import java.util.Scanner;

public class Jogador {
    Scanner sc = new Scanner(System.in);

    public String ladoDoJogador(){
        String ladoDoJogador = sc.next();
        return ladoDoJogador;
    }

    public int valorDoJogador(){
        int valorDoJogador = sc.nextInt();
        return valorDoJogador;
    }
}
