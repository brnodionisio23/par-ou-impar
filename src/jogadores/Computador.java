package jogadores;

import java.util.Scanner;

public class Computador {
    Scanner sc = new Scanner(System.in);

    public String lado(String ladoDoJogador){
        if(ladoDoJogador.equals("par")){
            return "impar";
        }
        else if (ladoDoJogador.equals("impar")){
            return "par";
        }
        else {
            return "Lado inválido";
        }
    }

    public int valor(){
        int valor = (int) (Math.random() * 10);
        return valor;
    }
}
