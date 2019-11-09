package Immutable;

/*
*  不可变模式： 你想修改都不让你修改。你破坏不了。
*
*  很多函数式编程的语言提到并发/并行就会大肆宣扬的概念了，你看我不会变，无副作用。还有不可变数据结构等等。
*
*  啥时候使用呢？ 实例一旦被初始化创建以后，对象状态不会发生变化，对象实例被多线程共享，频繁访问，多读者。
*
*
*/

public class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice", "Alasks");
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
    }
}
