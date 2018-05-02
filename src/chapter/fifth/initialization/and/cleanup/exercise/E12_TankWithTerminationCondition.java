package chapter.fifth.initialization.and.cleanup.exercise;

/**
 * Created by Jane on 2018/5/1.
 */
class Tank{
    static int counter;
    int id = counter++;
    boolean full;
    public Tank() {
        System.out.println("Tank " + id + " created");
        full = true;
    }
    public void empty() { full = false; }
    protected void finalize() {
        if(full)
            System.out.println("Error: tank " + id + " must be empty at cleanup");
        else
            System.out.println("Tank " + id + " cleaned up OK");
        }
    public String toString() { return "Tank " + id; }
}

public class E12_TankWithTerminationCondition {
    public static void main(String args[]) {
        new Tank().empty();
        new Tank();
        System.gc(); // Force finalization
        System.runFinalization();
    }
}
/*Tank 0 created
Tank 1 created
Error: tank 1 must be empty at cleanup
Tank 0 cleaned up OK*/
