import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String novaRodada = "s";

        System.out.println("BEM VINDO AO PAR OU IMPAR");
        System.out.println("");
        while(novaRodada.equals("s")) {
            System.out.println("teste");
            System.out.print("Deseja realizar mais uma rodada? (s / n)");
            novaRodada = sc.next().toLowerCase();
        }

        sc.close();
    }
}