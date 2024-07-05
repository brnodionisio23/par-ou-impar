package players;

public class Cpu {
    String side;
    int value;

    public String getSide() {
        return side;
    }

    public void setSide(String sideOfPlayer) {
        if (sideOfPlayer.equals("par")) {
            this.side = "impar";
        } else {
            this.side = "par";
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue() {
        this.value = (int) (Math.random() * 10);
    }
}
