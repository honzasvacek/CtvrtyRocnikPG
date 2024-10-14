public class GoodFactory implements Factory {
    public Jidlo vyrobJidlo(String jmenoJidla) {
        if (jmenoJidla == null) {
            return null;
        } else if (jmenoJidla.equals("spekacek")) {
            return new Spekacek();
        } else if (jmenoJidla.equals("jogurt")) {
            return new Jogurt(150);
        } else if (jmenoJidla.equals("jogurt500")) {
                return new Jogurt(500);
        } else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }
}
