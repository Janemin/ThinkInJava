package chapter.second.everything.is.an.object.exercise;

/**
 * Created by Jane on 2018/4/30.
 */
/**
 * 从命令行获得三个参数
 */
public class E10_ShowArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Need 3 arguments at least");
            /*  System.exit(0)是将你的整个虚拟机里的内容都停掉了 ，而dispose()只是关闭这个窗口，但是并没有停止整个application exit() 。无论如何，内存都释放了！也就是说连JVM都关闭了，内存里根本不可能还有什么东西
                System.exit(0)是正常退出程序，而System.exit(1)或者说非0表示非正常退出程序
                System.exit(status)不管status为何值都会退出程序。和return 相比有以下不同点：   return是回到上一层，而System.exit(status)是回到最上层 */
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
