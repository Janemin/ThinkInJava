package chapter.seventh.reusing.classes.exercise;

import chapter.seventh.reusing.classes.demo.Detergent;

/**
 * Created by Jane on 2018/5/5.
 */
class NewDetergent extends Detergent {
    public void scrub() {
        append(" NewDetergent.scrub()");
        super.scrub(); // Doesn't have to be first
    }
    public void sterilize() {
        append(" sterilize()");
    }
}

public class E02_NewDetergent {
    public static void main(String args[]) {
        NewDetergent nd = new NewDetergent();
        nd.dilute();
        nd.scrub();
        nd.sterilize();
        System.out.println(nd);
    }
}
/*Cleanser dilute()  NewDetergent.scrub() Deterget.scrub()  scrub()  sterilize()
 */
