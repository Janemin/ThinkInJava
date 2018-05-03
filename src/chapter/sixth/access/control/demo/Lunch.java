package chapter.sixth.access.control.demo;

/**
 * Created by Jane on 2018/5/3.
 */
public class Lunch {
    void testPrivate() {
        //Soup1 soup1 = new Soup1();
    }
    void testStatic() {
        Soup1 soup1 = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2 soup2 = Soup2.access();
        soup2.f();
    }

}
