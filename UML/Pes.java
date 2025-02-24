public class Pes extends ZvirataSMozkem {
    public Pes() {
        super(new Mozek("Psí mozek"));

        for (int i = 0; i < 4; i++) {
            addOrgan(new Noha(40));
        }

        addOrgan(new Oko("hnědá"));
        addOrgan(new Oko("hnědá"));
    }

    @Override
    public String toString() {
        return "Pes{" +
                "mozek=" + mozek +
                ", organy=" + organy +
                ", celková váha=" + vahaVsechOrganu() + " kg" +
                '}';
    }
}
