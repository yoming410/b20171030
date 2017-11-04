import java.util.Scanner;
public class hwk4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day =  sc.nextInt();

        if (month == 2 ){
            if (day<=18)
                System.out.println("Aquarius");
            else
                System.out.println("Picese");
        }
        if (month == 3 ){
            if (day<=20)
                System.out.println("Picese");
            else
                System.out.println("Aries");
        }
        if (month == 4 ){
            if (day<=20)
                System.out.println("Aries");
            else
                System.out.println("Taurus");
        }
        if (month == 5 ){
            if (day<=21)
                System.out.println("Taurus");
            else
                System.out.println("Gemini");
        }
        if (month == 6 ){
            if (day<=21)
                System.out.println("Gemini");
            else
                System.out.println("Cancer");
        }
        if (month == 7 ){
            if (day<=22)
                System.out.println("Cancer");
            else
                System.out.println("Leo");
        }
        if (month == 8 ){
            if (day<=23)
                System.out.println("leo");
            else
                System.out.println("Virgo");
        }
        if (month == 9 ){
            if (day<=23)
                System.out.println("Virgo");
            else
                System.out.println("Libra");
        }
        if (month == 10 ){
            if (day<=23)
                System.out.println("Libra");
            else
                System.out.println("Scprpio");
        }
        if (month == 11 ){
            if (day<=22)
                System.out.println("Scprpio");
            else
                System.out.println("Sagittars");
        }
        if (month == 12 ){
            if (day<=21)
                System.out.println("Sagittars");
            else
                System.out.println("Capricorn");
        }
        if (month == 1 ){
            if (day<=21)
                System.out.println("Capricorn");
            else
                System.out.println("Aquarius");
        }


    }
}