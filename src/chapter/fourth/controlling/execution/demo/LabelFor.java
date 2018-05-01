package chapter.fourth.controlling.execution.demo;

import static net.mindview.util.Print.print;

/**
 * Created by Jane on 2018/5/1.
 */

/**
 * 在java中需要使用标签的唯一理由就是因为有循环嵌套存在，而且想从多层嵌套中break或者continue
 */
public class LabelFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for(; true;) {
            inner:
            for (; i < 10; i++) {
                print("i = " + i);
                if(i == 2) {
                    print("continue");
                    continue ;       // 跳过本次内部循环，继续内部循环
                }
                if(i == 3) {
                    print("break");
                    i++;
                    break;          // 跳过内部循环，继续外部循环
                }
                if(i == 7) {
                    print("continue outer");
                    i++;
                    continue outer; // 跳到outer标签处，继续外部迭代
                }
                if(i == 8) {
                    print("break outer");
                    break outer;    // 跳到break标签处，中断所有迭代
                }
                {
                    print("continue inner");
                    continue inner; //跳到inner处，继续内部循环；
                }
            }
        }
    }
}
/*
i = 0
continue inner
i = 1
continue inner
i = 2
continue
i = 3
break
i = 4
continue inner
i = 5
continue inner
i = 6
continue inner
i = 7
continue outer
i = 8
break outer
*/
