package chapter.fifth.initialization.and.cleanup.demo;

/**
 * Created by Jane on 2018/5/2.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal() + " " + Spiciness.getDescribe(s));
    }
}
/*NOT, ordinal 0 not
MILD, ordinal 1 mild
MEDIUM, ordinal 2 medium
HOT, ordinal 3 hot
FLAMING, ordinal 4 flaming*/
