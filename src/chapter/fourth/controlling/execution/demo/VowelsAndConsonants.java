package chapter.fourth.controlling.execution.demo;

import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by Jane on 2018/5/1.
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int c = 'a' + random.nextInt(26);
            printnb(c + "->" + (char)c);

            switch (c) {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' : print(" vowel");
                           break;
                case 'y' :
                case 'w' : print(" sometimes vowel");
                           break;
                default: print(" consonant");
            }
        }
    }
}
/*114->r consonant
105->i vowel
103->g consonant
117->u vowel
98->b consonant
114->r consonant
116->t consonant
100->d consonant
110->n consonant
110->n consonant*/
