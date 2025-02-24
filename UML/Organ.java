abstract class Organ {
    protected int vaha;

    public int getVaha() {
        return vaha;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(vaha=" + vaha + ")";
    }
}