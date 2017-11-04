import java .util.Scanner;
public class hwk3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 400 ==0 )
            System.out.println("Bissextile Year");
          else if (x % 4 ==0  && x%100!=0 )
            System.out.println("Bissextile Year");
          else
            System.out.println("Common Year");
    }

}
