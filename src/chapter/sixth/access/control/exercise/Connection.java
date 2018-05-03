package chapter.sixth.access.control.exercise;

/**
 * Created by Jane on 2018/5/3.
 */
public class Connection {
    private static int counter = 0;
    private int id = counter++;
    Connection() {}
    public String toString() {
        return "Connection " + id;
    }
    public void doSomething() {}
}
