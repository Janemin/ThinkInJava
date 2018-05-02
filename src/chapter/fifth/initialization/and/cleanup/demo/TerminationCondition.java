package chapter.fifth.initialization.and.cleanup.demo;

/**
 * Created by Jane on 2018/5/1.
 */

/**
 * 使用finalize()方法，进行-终结条件-验证
 */
class Book {
    String name = "default name";
    boolean checkedOut = false;
    Book(String name, Boolean checkedOut) {
        this.name = name;
        this.checkedOut = checkedOut;
    }
    void checkIn() {
        this.checkedOut = false;
    }
    @Override
    protected void finalize() {
        //终结条件验证
        if(checkedOut) {
            System.out.println(name + " Error : checked out");
        }
        //super.finalize();
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book("story book", true);
        //proper cleanup : 等待清理
        novel.checkIn();

        new Book("picture", true);
        //force garbage collection & finalization : 强制垃圾回收和终结操作
        System.gc();
    }
    /*picture Error : checked out*/
}
