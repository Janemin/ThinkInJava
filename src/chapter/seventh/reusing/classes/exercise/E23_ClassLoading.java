package chapter.seventh.reusing.classes.exercise;

/**
 * Created by Jane on 2018/5/5.
 */
class LoadTest {
    // The static clause is executed
// upon class loading:
    static {
        System.out.println("Loading LoadTest");
    }
    static void staticMember() {}
}
public class E23_ClassLoading {
    public static void main(String args[]) {
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Creating an object");
        new LoadTest();
    }
}

/*
Calling static member
Loading LoadTest
Creating an object*/