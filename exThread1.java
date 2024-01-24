class demo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread=" + i);
            try {
                // Sleep for 500 milliseconds (0.5 seconds)
                Thread.sleep(900);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    };
}

public class exThread1 {
    public static void main(String[] args) {
        Demo ob = new Demo();
        Thread t = new Thread(ob);
        t.setName("Subha");
        t.start();
        System.out.println(t.getState());

        for (int i = 0; i < 10; i++) {
            System.out.println("Main=" + i);
            try {
                // Sleep for 500 milliseconds (0.5 seconds)
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(t.getName());
        System.out.println(t.getPriority());//Default Priority Of a Thread is 5
        System.out.println(t.getId());//Thread Id
        System.out.println(t.getState());//Thread state
    }
}
