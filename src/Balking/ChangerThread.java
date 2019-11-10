package Balking;

import java.io.IOException;
import java.util.Random;

// 修改数据内容，并执行保存处理
public class ChangerThread extends Thread {
    private final Data data;
    private final Random random = new Random();

    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; ++i) {
                data.change("No." + i);
                Thread.sleep(random.nextInt(1000));
                data.save();
            }
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
