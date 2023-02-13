public class Seller implements Runnable {
    Store s;
    Seller(Store s) {
        this.s = s;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            s.get();
        }
    }
}