public class AnotaceMain {

    public static void main(String[] args) {
        MojeTrida mojeTrida = new MojeTrida();

        if (mojeTrida.getClass().isAnnotationPresent(Autor.class)) {
            // Get the annotation
            Autor autorAnnotation = mojeTrida.getClass().getAnnotation(Autor.class);

            System.out.println("Autor jména: " + autorAnnotation.jmeno());
        } else {
            System.out.println("Třída nemá anotaci @Autor");
        }
    }
}

