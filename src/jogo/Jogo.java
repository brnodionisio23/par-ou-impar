package jogo;

import java.util.Scanner;

import jogadores.Computador;
import jogadores.Jogador;

public class Jogo {
    Scanner sc = new Scanner(System.in);

    public static Object[] escolherJogadores(){
        Jogador jogador = new Jogador();
        Computador computador = new Computador();
        Object[] jogadores = {jogador,computador};
        return jogadores;
    }

    public String[] escolherLado(Object[] jogadores){
        Jogador jogador = (Jogador) jogadores[0];
        Computador computador = (Computador) jogadores[1];

        String ladoDoJogador = jogador.lado();
        String ladoDoComputador = computador.lado(ladoDoJogador);
        String[] lados = {ladoDoJogador, ladoDoComputador};
        return lados;
    }

}
