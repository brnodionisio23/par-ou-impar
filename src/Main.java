import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        novaRodada = "s";

        System.out.println("BEM VINDO AO PAR OU IMPAR");
        System.out.println(" ");

        while(novaRodada.equals("s")) {
            System.out.println("Escolha: par ou impar");
            escolhaDoJogador = sc.next();

            if(escolhaDoJogador.equals("par")) {
                escolhaDoComputador = "impar";
            }
            else {
                escolhaDoComputador = "par";
            }

            System.out.println(escolhaDoComputador);

            System.out.print("Deseja realizar mais uma rodada? (s / n): ");
            novaRodada = sc.next().toLowerCase();
        }

        sc.close();
    }

    static String novaRodada;
    static String escolhaDoJogador;
    static String escolhaDoComputador;
}