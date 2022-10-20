import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật");
        int lenght = sc.nextInt();
        System.out.println("Nhập chiều rộng của hình chữ nhật");
        int width = sc.nextInt();
        int areaRectangle = lenght*width;
        int perimeter = (lenght+width)*2;
        System.out.println("Diện tích hcn là: " + areaRectangle);
        System.out.println("Chu vi hcn là: " + perimeter);
    }

}
