public class DeadlockThread {
    public static void main(String[] args) {
        try {
            System.out.println("Entering into the DaedLock");
            Thread.currentThread().join();
        }
        catch (Exception e){

        }
    }
}
