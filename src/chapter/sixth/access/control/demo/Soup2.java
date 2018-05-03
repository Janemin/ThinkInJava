package chapter.sixth.access.control.demo;

/**
 * Created by Jane on 2018/5/3.
 */
public class Soup2 {
    private Soup2() {
    }

    private static Soup2 soup2 = new Soup2();
    public static Soup2 access() {
        return soup2;
    }

    public void f() {

    }
}
