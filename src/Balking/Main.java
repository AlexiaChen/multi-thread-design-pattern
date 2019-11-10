package Balking;

/*
*  Balking模式与Guard Suspension模式一样，也存在condition_variable类似的操作。
*  但是在该模式中，如果条件不成立，则是立即中断处理，反之，Guard Suspension模式是等到可以开始运行处理的条件
*  简而言之就是，不需要（条件没达到）就算了
*/
public class Main {
    public static void main(String[] args) {
        Data data = new Data("data.txt", "(empty)");
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
