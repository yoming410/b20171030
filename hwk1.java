import java .util.Scanner;
public class hwk1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x*x+y*y<=10000)
            System.out.println("inside");
        else
            System.out.println("outside");

    }

}