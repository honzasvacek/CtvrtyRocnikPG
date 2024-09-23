//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SingletonMain {
    public static void main(String[] args) {
        SingletonThread thread = new SingletonThread();
        thread.start();
        SingletonClass jedinacek = SingletonClass.getInstance();


    }
}