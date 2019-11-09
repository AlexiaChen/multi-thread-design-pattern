package Immutable;

// 该实例一旦创建，便不会被修改，只有getter，成员变量都用final修饰
public final class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "[ Person: name = " + name + ", address = " + address + " ]";
    }
}
