package rejimboga;

import java.util.*;

public class rejimboga {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Перша сторона:");
        int a = sc.nextInt();

        System.out.print("Дурга сторона:");
        int b = sc.nextInt();

        System.out.print("Третя сторона:");
        int c = sc.nextInt();

        if (a != 0 && b != 0 && c != 0) {

            if (a + b < c || b + c < a || a + c < b) {
                System.out.println("Триткутник не існує");
            } else if (a + b > c || b + c > a || a + c > b) {
                System.out.println("Трикутник існує");
            }
        } System.out.println("Error");
    }
}
