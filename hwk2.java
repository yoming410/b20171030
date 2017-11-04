import java.util.Scanner;
public class hwk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 5 && x >= 3)
            System.out.println("Spring");
        else if (x <= 8 && x >= 6)
            System.out.println("Summer");
        else if (x <= 11 && x >= 9)
            System.out.println("Autumn");
        else
            System.out.println("Winter");

    }
}