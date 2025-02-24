import java.util.ArrayList;

public abstract class Zvire {
    protected ArrayList<Organ> organy;

    public Zvire() {
        this.organy = new ArrayList<>();
    }

    // Calculate the total weight of all organs
    public int vahaVsechOrganu() {
        int vahaVsechOrganu = 0;
        for (Organ organ : organy) {
            vahaVsechOrganu += organ.vaha;
        }
        return vahaVsechOrganu;
    }

    // Add an organ to the list of organs
    public void addOrgan(Organ organ) {
        organy.add(organ);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {celkova vaha=" + vahaVsechOrganu() + ", organy=" + organy + "}";
    }
}
