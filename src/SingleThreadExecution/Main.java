package SingleThreadExecution;


/*
*  单线程执行模式：就是说，同一时刻，只有一个线程能访问执行，其他线程都得排队等待
*
*  临界区，mutex之类的都是这样的。一般涉及到多线程共享资源的时候会用到该模式。用同步语义让线程排队
*
*  Java提供了一些线程安全的集合类： synchronizedCollection ......
*  一般来说，锁的区域一般要尽可能小。所以Java中ConcurrentHashMap把锁粒度分散到各个Hash桶中，降低粒度，以提高并发访问量。HashTable
*  虽然线程安全，但是是一把实例大锁加上的，统一时刻只有一个线程访问，并发量不行
*
*   Java标准定义了一些原子操作，比如char，int等基本类型的赋值和引用都是原子的，对象引用类型的复制和引用操作也是原子的。但是long，double
*   的复制和引用就不是原子的。如果要让long，double变为原子，那么请用volatile修饰。
*
*   当然，原子性和内存可见性又不是一个东西，如果一个原子字段int从0变到2,如果没有用volatile修饰，或者用synchronized同步化，那么最糟糕的情况
*   可能就是，其他线程“看不到”这个原子字段的最新的修改值。当然，可能一辈子都看不到，看你运气了。
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing");
        Gate gate = new Gate();

        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bob", "Berkeley").start();
        new UserThread(gate, "Mike", "Michigan").start();
    }
}
