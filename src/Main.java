import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        novaRodada = "s";

        System.out.println("BEM VINDO AO PAR OU IMPAR");
        System.out.println(" ");

        while (novaRodada.equals("s")) {
            System.out.println("Escolha: par ou impar");
            escolhaDoJogador = sc.next();

            if (escolhaDoJogador.equals("par")) {
                escolhaDoComputador = "impar";
                ladoDoComputador(escolhaDoComputador);
            } else {
                escolhaDoComputador = "par";
                ladoDoComputador(escolhaDoComputador);
            }

            System.out.println("Digite um número entre 0 e 9");
            valorDoJogador = sc.nextInt();

            valorDoComputador = (int) (Math.random() * 10);
            System.out.println("Computador: " + valorDoComputador);

            if((valorDoJogador + valorDoComputador) % 2 == 0){
                if (escolhaDoJogador.equals("par")){
                    System.out.println("Você venceu!");
                } else{
                    System.out.println("O computador venceu!");
                }
            } else {
                if (escolhaDoJogador.equals("impar")){
                    System.out.println("Você venceu!");
                } else{
                    System.out.println("O computador venceu!");
                }
            }

            System.out.print("Deseja realizar mais uma rodada? (s / n): ");
            novaRodada = sc.next().toLowerCase();
        }

        sc.close();
    }

    static String novaRodada;
    static String escolhaDoJogador;
    static String escolhaDoComputador;
    static int valorDoJogador;
    static int valorDoComputador;

    public static void ladoDoComputador(String lado) {
        System.out.println("Computador: " + lado + "!");
    }

}