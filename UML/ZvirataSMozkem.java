public class ZvirataSMozkem extends Zvire {
    protected Mozek mozek;

    public ZvirataSMozkem(Mozek mozek) {
        super();
        this.mozek = mozek;
        addOrgan(mozek);
    }

    public Mozek getMozek() {
        return mozek;
    }

    public void setMozek(Mozek mozek) {
        this.mozek = mozek;
    }
}
