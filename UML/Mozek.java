public class Mozek extends Organ {
    private String typ;

    public Mozek(String typ) {
        this.typ = typ;
        this.vaha = 15; // Default weight for the brain
    }

    public String getTyp() {
        return typ;
    }
}