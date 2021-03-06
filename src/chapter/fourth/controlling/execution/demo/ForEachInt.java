package chapter.fourth.controlling.execution.demo;

import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;

/**
 * Created by Jane on 2018/5/1.
 */
public class ForEachInt {
    public static void main(String[] args) {
        for(int i : range(5))
            printnb(i + " ");
        print();
        for(int i : range(5,10))
            printnb(i + " ");
        print();
        for(int i : range(5, 20, 3))
            printnb(i + " ");
        print();
    }
/*
0 1 2 3 4
5 6 7 8 9
5 8 11 14 17
*/
}
