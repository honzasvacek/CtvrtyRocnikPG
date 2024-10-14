public class HamNamFactory implements Factory {
    public Jidlo vyrobJidlo(String jmenoJidla) {
        if (jmenoJidla == null) {
            return null;
        } else if (jmenoJidla.equals("spekacek")) {
            return new HamNamSpekacek();
        } else if (jmenoJidla.equals("jogurt")) {
            return new HamNamjogurt(150);
        } else if (jmenoJidla.equals("jogurt500")) {
            return new HamNamjogurt(500);
        } else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }
}