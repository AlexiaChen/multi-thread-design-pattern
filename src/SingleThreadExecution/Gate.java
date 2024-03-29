package SingleThreadExecution;

// 线程安全
public class Gate {
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    // 如果把synchronized 取消掉，就会出现BROKEN.
    public synchronized void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public synchronized String toString() {
        return "No. " + counter + ": " + name + ", " + address;
    }

    private void check() {
        if(name.charAt(0) != address.charAt(0)) {
            System.out.println("******** BROKEN ************ " + toString());
        }
    }
}
