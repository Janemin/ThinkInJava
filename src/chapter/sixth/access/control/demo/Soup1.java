package chapter.sixth.access.control.demo;


/**
 * Created by Jane on 2018/5/3.
 */
public class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}
