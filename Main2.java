import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int sum = 0;
        for (int i = x ; x<=y ; x++ )
        {sum = sum+x;}
        System.out.println(sum);
    }
}