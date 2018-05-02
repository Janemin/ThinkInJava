package chapter.fifth.initialization.and.cleanup.demo;

/**
 * Created by Jane on 2018/5/2.
 */
public enum Spiciness {
    NOT, MILD, MEDIUM, HOT ,FLAMING;

    public static String getDescribe(Spiciness spiciness) {
        switch (spiciness) {
            case NOT: return "not";
            case MILD: return "mild";
            case MEDIUM: return "medium";
            case HOT: return "hot";
            case FLAMING: return "flaming";
            default: return "";
        }
    }
}
/*枚举中自动创建toString(),values(),oridinal()方法
* oridinal()方法返回 enum内常量的声明顺序
* values()方法返回 根据常量声明顺序，产生的常量值构成的数组
* =====详见EnumOrder类=====
* 枚举和switch配合绝佳
* */
