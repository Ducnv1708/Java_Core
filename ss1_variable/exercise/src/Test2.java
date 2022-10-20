import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập độ dài cạnh thứ nhất : ");
        a = sc.nextInt();
        int b;
        System.out.println("Nhập độ dài cạnh thứ hai : ");
        b = sc.nextInt();
        int c;
        System.out.println("Nhập độ dài cạnh thứ ba : ");
        c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh là cạnh của một tam giác");
        } else {
            System.out.println("Ba cạnh không phải là cạnh của một tam giác");
        }
    }
}