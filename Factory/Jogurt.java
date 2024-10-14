public class Jogurt implements Jidlo {
    int vaha;
    public int dejCenu() {
        return 19;
    }

    public String ingredience() {
        return "mleko";
    }

    public Jogurt(int vaha) {
        this.vaha = vaha;
    }
}
