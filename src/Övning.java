import java.util.Random;
import java.util.Scanner;

/**
 * Created by scem14 on 2016-09-16.
 */
public class Övning {

//Skapa Frågerna
    static int[] q1;
    static int[] q2;

    public static void main(String[] args) {
        cQuestions();
        aQuestions();
        coQuestions();
    }

    public static void cQuestions() {
        Random n = new Random();
        g1 = new int (10);
        g2 = new int (10);
        for (int i = 0 ; i < 10 ; i++) {
                q1(i) = n.nextInt(1000);
                q2(i) = n.nextInt(1000);
        }
    }
//Ställa Frågorna (1 thru 10)
    public static void aQuestions(){
        Scanner in = new Scanner(System.in);
        svar = new int(10);
        for (int i = 0 ; i < 10 ; i++;)


    }
//Rätta Svar
    public static void coQuestions(){

    }
}
