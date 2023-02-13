public class Consumer implements Runnable {
    Store s;
    Consumer(Store s){
        this.s = s;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            s.pokupka();
        }
    }
}