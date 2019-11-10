package Balking;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 表示当前数据的类
public class Data {
    private final String filename; // 保存文件名
    private String content;  // 数据内容
    private boolean changed; // 修改后的内容若未保存，则为true

    public Data(String filename, String content) {
        this.filename = filename;
        this.content = content;
        this.changed = true;
    }

    public synchronized void change(String newContent) {
        content = newContent;
        changed = true;
    }

    public synchronized void save() throws IOException {
        // 没有改变就没必要保存，这个是该模式最重要的
        if(!changed) {
            return;
        }
        doSave();
        changed = false;
    }

    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls doSave, content= " + content);
        try(Writer writer = new FileWriter(filename)) {
            writer.write(content);
        }catch (IOException e) {
            throw e;
        }
    }
}
