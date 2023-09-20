package Secssion1_thuchanh3;
import java.util.Scanner;
public class Th3 {
    public static void main(String[] args) {

        float width, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = sc.nextFloat();
        System.out.print("Enter height: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
