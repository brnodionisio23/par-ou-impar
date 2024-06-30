import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        novaRodada = "s";

        System.out.println("*** BEM VINDO AO PAR OU IMPAR ***");
        System.out.println(" ");

        while (novaRodada.equals("s")) {
            System.out.print("Escolha um lado: Par ou Impar: ");
            escolhaDoJogador = sc.next();

            if (escolhaDoJogador.equals("par")) {
                escolhaDoComputador = "Impar";
                ladoDoComputador(escolhaDoComputador);
            } else {
                escolhaDoComputador = "Par";
                ladoDoComputador(escolhaDoComputador);
            }

            System.out.print("Digite um número entre 0 e 9: ");
            valorDoJogador = sc.nextInt();




            System.out.println(" ");

            System.out.println("Resultado: " + resultadoDaSoma);

            if (resultadoDaSoma % 2 == 0) {
                if (escolhaDoJogador.equals("par")) {
                    vitoriasDoJogador++;
                    System.out.println("Você venceu!");

                } else {
                    vitoriasDoComputador++;
                    System.out.println("O computador venceu!");
                }
            } else {
                if (escolhaDoJogador.equals("impar")) {
                    vitoriasDoJogador++;
                    System.out.println("Você venceu!");
                } else {
                    vitoriasDoComputador++;
                    System.out.println("O computador venceu!");
                }
            }

            System.out.println(" ");
            System.out.println("Placar: " + vitoriasDoJogador + " x " + vitoriasDoComputador);
            System.out.println(" ");

            System.out.print("Deseja realizar mais uma rodada? (s / n): ");
            novaRodada = sc.next().toLowerCase();
            System.out.println("");
            System.out.println(("********************************"));
            System.out.println("");
        }

        sc.close();
    }

    static String novaRodada;
    static String escolhaDoJogador;
    static String escolhaDoComputador;
    static int valorDoJogador;
    static int valorDoComputador;
    static int resultadoDaSoma = valorDoJogador + valorDoComputador;
    static int vitoriasDoJogador = 0;
    static int vitoriasDoComputador = 0;

    public static void ladoDoComputador(String lado) {
        System.out.println("Computador: " + lado + "!");
        System.out.println(" ");
    }

}