public class Nezmar extends ZvirataBezMozku {
    public Nezmar() {

        addOrgan(new Noha(10));
        addOrgan(new Oko("kalná"));
        addOrgan(new Chapadla(8));

    }

    @Override
    public String toString() {
        return "Nezmar{" +
                "organy=" + organy +
                ", weight=" + vahaVsechOrganu() + " kg" +
                '}';
    }
}
