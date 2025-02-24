@Autor(jmeno = "Pepa z Depa")
@Deprecated
public class MojeTrida {

    @Zpracuj(priorita = 1)
    public void metoda1() {
        System.out.println("Zpracovávám metodu 1");
    }

    @Zpracuj(priorita = 10)
    public void metoda2() {
        System.out.println("Zpracovávám metodu 2");
    }

    public void metoda3() {
        System.out.println("Metoda 3 není označena anotací");
    }
}
