package GuardedSuspension;

// 用户表示CientThread传递给ServerThread的实例，不提供特殊处理
public class Request {
    private final String name;

    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[ Request " + name + " ]";
    }
}
