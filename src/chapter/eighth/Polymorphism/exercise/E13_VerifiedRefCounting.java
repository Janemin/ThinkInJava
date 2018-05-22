package chapter.eighth.Polymorphism.exercise;

import static net.mindview.util.Print.print;

/**
 * Created by Jane on 2018/5/22.
 */
class Shared {
    private int refcount = 0;
    private static int counter = 0;
    private int id = counter++;
    public Shared() {
        print("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            print("Disposing " + this);
    }
    protected void finalize() {
        if(refcount != 0)
            print("Error: object is not properly cleaned-up!");
    }
    public String toString() { return "Shared " + id; }
}
class Composing {
    private Shared shared;
    private static int counter = 0;
    private int id = counter++;
    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}
public class E13_VerifiedRefCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared) };
        for(Composing c : composing)
            c.dispose();
        System.gc();
// Verify failure:
        new Composing(new Shared());
        System.gc();
    }
}
/*
        Creating Shared 0
        Creating Composing 0
        Creating Composing 1
        Creating Composing 2
        Creating Composing 3
        Creating Composing 4
        disposing Composing 0
        disposing Composing 1
        disposing Composing 2
        disposing Composing 3
        disposing Composing 4
        Disposing Shared 0
        Creating Shared 1
        Creating Composing 5
        Error: object is not properly cleaned-up!*/
