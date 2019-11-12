package ProducerConsumer;

/*
* 一般消息队列或者Channel（FIFO，stack等）就是这种模式的实现，生产者将数据安全地交给消费者，并且消除线程或者进程间的处理速度差异
*  当消费者和生产者分别只有一个时，又叫Pipe模式（管道模式）
*
*/

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("Maker 1", table, 31513).start();
        new MakerThread("Maker 2", table, 12411).start();
        new MakerThread("Maker 3", table, 12221).start();

        new EaterThread("Eater 1", table, 31113).start();
        new EaterThread("Eater 2", table, 12111).start();
        new EaterThread("Eater 3", table, 21513).start();
    }
}
