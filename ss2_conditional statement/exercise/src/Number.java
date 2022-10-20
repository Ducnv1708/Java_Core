import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Phím mà bạn ấn xuống là : ");
            int key = sc.nextInt();
            switch (key) {
                case 0:
                    System.out.println("Phím mà bạn ấn xuống là 0");
                    break;
                case 1:
                    System.out.println("Phím mà bạn ấn xuống là 1");
                    break;
                case 2:
                    System.out.println("Phím mà bạn ấn xuống là 2");
                    break;
                case 3:
                    System.out.println("Phím mà bạn ấn xuống là 3");
                    break;
                case 4:
                    System.out.println("Phím mà bạn ấn xuống là 4");
                    break;
                case 5:
                    System.out.println("Phím mà bạn ấn xuống là 5");
                    break;
                case 6:
                    System.out.println("Phím mà bạn ấn xuống là 6");
                    break;
                case 7:
                    System.out.println("Phím mà bạn ấn xuống là 7");
                    break;
                case 8:
                    System.out.println("Phím mà bạn ấn xuống là 8");
                    break;
                case 9:
                    System.out.println("Phím mà bạn ấn xuống là 9");
                    break;
                default:
                    System.out.println("Phím bạn ấn kh phải là số");
            }

        }
    }
}
