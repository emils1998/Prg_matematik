import java.util.Random;
import java.util.Scanner;

/**
 * Created by scem14 on 2016-09-16.
 */
public class Övning {

    //Skapa Frågerna
    static int[] q1;
    static int[] q2;
    static int[] svar;

    public static void main(String[] args) {
        cQuestions();
        aQuestions();
        coQuestions();
    }

    public static void cQuestions() {
        Random n = new Random();
        q1 = new int[10];
        q2 = new int[10];
        for (int i = 0; i < 10; i++) {
            q1[i] = n.nextInt(1000);
            q2[i] = n.nextInt(1000);
        }
    }

    //Ställa Frågorna (1 thru 10)
    public static void aQuestions() {
        svar = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Vad är " + q1[i] + " + " + q2[i] + " ? ");
            svar[i] = in.nextInt();
        }
    }



//Rätta Svar
    public static void coQuestions() {
        int poäng = 0;
        for (int i = 0 ; i < 10 ; i++) {
            if(q1[i] + q2[i] == svar[i]) {
                System.out.println(q1[i] + " + " + q2[i] + " + " + svar[i] + "(Rätt)");
                    poäng += 10;
                }

                else{
                    System.out.println(q1[i] + " + " + q2[i] + " = " + svar[i] + "(" + "Fel, det rätta svaret är " + (q1[i] + q2[i]) + ")");
                }
            }
            System.out.println("\nTotal poäng: " + poäng);
        }
        }

