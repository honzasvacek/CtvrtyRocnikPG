public class SingletonThread extends Thread{

    @Override
    public void run() {
        SingletonClass jedinacek = SingletonClass.getInstance();

        while(true) {
            System.out.println(jedinacek.state);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
