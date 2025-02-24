public class Noha extends CastTela {
    private int delka;

    public Noha(int delka) {
        this.delka = delka;
        this.vaha = delka*3; // váha podle délky
    }

    public int getDelka() {
        return delka;
    }

    @Override
    public String toString() {
        return "Noha{" +
                "delka=" + delka +
                ", vaha=" + vaha +
                '}';
    }
}