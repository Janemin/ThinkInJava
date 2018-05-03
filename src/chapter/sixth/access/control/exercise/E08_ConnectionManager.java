package chapter.sixth.access.control.exercise;

import static net.mindview.util.Print.print;

/**
 * Created by Jane on 2018/5/3.
 */
public class E08_ConnectionManager {
    public static void main(String args[]) {
        Connection c = ConnectionManager.getConnection();
        while(c != null) {
            print(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}
/*Connection 0
Connection 1
Connection 2
Connection 3
Connection 4
Connection 5
Connection 6
Connection 7
Connection 8
Connection 9*/
