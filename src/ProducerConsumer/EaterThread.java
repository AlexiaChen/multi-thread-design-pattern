package ProducerConsumer;

import java.util.Random;

public class EaterThread extends Thread {
    private final Random random;
    private final Table table;

    public EaterThread(String name, Table table, long seed) {
        super(name);
        this.random = new Random(seed);
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while(true) {
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        }catch (InterruptedException e) {

        }
    }
}
