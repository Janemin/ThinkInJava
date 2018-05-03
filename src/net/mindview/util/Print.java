package net.mindview.util;

import java.io.PrintStream;

/**
 * Created by Jane on 2018/5/1.
 */
public class Print {
    private Print() {
    }

    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    public static void print() {
        System.out.println();
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
