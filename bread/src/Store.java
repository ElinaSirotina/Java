public class Store {
    int zakaz = 0;
    int prodaja = 0;
    public synchronized void zakaz() {
        while (zakaz >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        zakaz++;
        System.out.println("Хлеб заказали");
        System.out.println("\tостаток на складе : " + zakaz);
        notify();
    }
    public synchronized void get() {
        while (zakaz < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        zakaz--;
        prodaja++;
        System.out.println("Хлеб забрали");
        System.out.println("\tколичество хлеба в магазине : " + prodaja);
        System.out.println("\tостаток на складе : " + zakaz);
        if (zakaz == 0 && prodaja == 5) {
            notify();
        }
    }
    public synchronized void pokupka() {
        while (prodaja < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(500);
            prodaja--;
            zakaz++;
            System.out.println("Хлеб купили");
            System.out.println("\tколичество хлеба купили : " + zakaz);
            System.out.println("\tостаток у  продавца : " + prodaja);
            if (zakaz == 0 && prodaja == 5) {
                notify();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
