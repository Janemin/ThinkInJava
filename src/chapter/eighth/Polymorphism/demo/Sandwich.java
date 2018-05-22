package chapter.eighth.Polymorphism.demo;

import static net.mindview.util.Print.print;

/**
 * Created by Jane on 2018/5/22.
 */
class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() { print("Bread()");}
}

class Cheese {
    Cheese() { print("Cheese()");}
}

class Lettuce {
    Lettuce() { print("Lettuce()");}
}

class Lunch extends Meal {
    Lunch () {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {print("PortableLunch");}
}

public class Sandwich extends PortableLunch{
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce= new Lettuce();

    public Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

}
/*
    Meal()
    Lunch()
    PortableLunch
    Bread()
    Cheese()
    Lettuce()
    Sandwich()
    */
/*
对象初始化顺序：
1）调用基类构造器（递归到最高层，开始向下调用，直到最低层的导出类）。
2）按声明顺序调用成员的初始化方法。
3）调用导出类构造器的主体
*/
