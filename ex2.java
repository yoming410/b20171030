import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                System.out.print("A");
            } else {
                System.out.print("*");
            }
        }
    }
}