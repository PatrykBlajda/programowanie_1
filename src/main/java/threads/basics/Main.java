package threads.basics;
import static threads.ThreadColor.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Main thread in action");
        Thread otherThread = new OtherThread();
        otherThread.setName("==== OTHER THREAD ====");
        otherThread.start(); //wywołujemy start() mimo, że przeładowaliśmy run()
        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();
        System.out.println(ANSI_PURPLE + "End of main");
        //klasa anonimowa
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class based thread");
            }
        }.start();
        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Overriden RunnableSample");
                try {
                    otherThread.join(); //jeden wątek czeka na drugi
                    System.out.println(ANSI_RED + "Other tread terminated" + "so I work again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "Overriden runnable terminated");
                }
            }
        });
        runnableSample.start();
        otherThread.interrupt();
    }
}
