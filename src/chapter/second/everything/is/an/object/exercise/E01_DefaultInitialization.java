package chapter.second.everything.is.an.object.exercise;

/**
 * Created by Jane on 2018/4/30.
 */

/**
 * 创建一个类，它包含一个int域和一个char域，它们没有被初始化，将它们的值打印出来，以验证Java执行了默认初始化。
 */
public class E01_DefaultInitialization {
    int a;
    char c;
    public E01_DefaultInitialization() {
        System.out.println("int a = " + a);
        System.out.println("char c = [" + c + "]");
    }
    public static void main(String[] args) {
        new E01_DefaultInitialization();
    }
    /* Output
    int a = 0     int default value 0
    char c = [ ]  char defeult value is space */
}
