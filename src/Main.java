import Players.Cpu;
import Players.Player;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        Cpu p2 = new Cpu();

        p1.setSide("par");
        p2.setSide(p1.getSide());

        System.out.println(p2.getSide());
    }
}