public class Producer implements Runnable{
    Store s;
    Producer(Store s) {
        this.s = s;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            s.zakaz();
        }
    }
}
