package GuardedSuspension;

/*
*  通过让线程等待来保证实例安全，其实就是条件变量等待的形式
*
*  C++ 里面也有对应的condition_variable.wait(), 然后notify 或者notify all
*
*
*/

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 3141213L).start();
        new ServerThread(requestQueue, "Bob", 235223535L).start();
    }
}
