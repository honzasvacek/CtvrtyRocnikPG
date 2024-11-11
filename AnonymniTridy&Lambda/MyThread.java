public class MyThread implements Runnable {
    //tohle mělo být v jiném soboru pro lepší ilustraci
    public void run() {
        for(int i = 0; i<100; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        Thread thread1 = new Thread(t1);
        thread1.start();

        //anonymní třída místo nové třídy a nového souboru
        Runnable t3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    for (int j = 'a'; j < 'z'; j++) {
                        System.out.println((char) j);
                    }
                }
            }
        };

        Thread thread3 = new Thread(t3);
        thread3.start();

        Runnable t4 = new Runnable() {
            @Override
            public void run() {
                for (int i = -1; i >= -99; i--) {
                    System.out.println(i);
                }
            }
        };

        Thread thread4 = new Thread(t4);
        thread4.start();

        //Lambda expression
        //lze použít když má jen jednu metodu
        //nemusím deklarovat new Runnable, java to ví a nemusím dávat název metody, protože je jen jedna, takže píš jen tělo
        Runnable tr5 = () -> {
            for (int i = 'z'; i >= 'a'; i--) {
                System.out.println((char) i);
            }
        };

        //dokonce i takto
        Thread threadLambda = new Thread(() -> {
            for (int i = 'z'; i >= 'a'; i--) {
                System.out.println((char) i);
            }
        });
        threadLambda.start();
    }
}
