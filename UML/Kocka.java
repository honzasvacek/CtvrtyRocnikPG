public class Kocka extends ZvirataSMozkem {
    public Kocka() {
        super(new Mozek("Kočičí mozek"));

        for (int i = 0; i < 4; i++) {
            addOrgan(new Noha(30));
        }

        addOrgan(new Oko("zelená"));
        addOrgan(new Oko("zelená"));
    }

    @Override
    public String toString() {
        return "Kocka{" +
                "mozek=" + mozek +
                ", organy=" + organy +
                ", calková váha=" + vahaVsechOrganu() + " kg" +  // Include total weight in the output
                '}';
    }
}
