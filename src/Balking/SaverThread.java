package Balking;

import java.io.IOException;

// 定期保存数据的线程
public class SaverThread extends Thread {
    private final Data data;

    public SaverThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                data.save();
                Thread.sleep(1000);
            }
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
