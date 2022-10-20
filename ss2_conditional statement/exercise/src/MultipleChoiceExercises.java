import java.util.Scanner;

public class MultipleChoiceExercises {
    public static void main(String[] args) {
        //Bài tập 2: Viết chương trình C# cho phép người sử dụng chọn câu trả lời
        // (giống như chương trình thi trắc nghiệm).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cách nào khai báo một biến và gán giá trị số nguyên là đúng trong các câu lệnh sau?\n" +
                "a. int 1x=10;\n" +
                "b. int x=10;\n" +
                "c. float x=10.0f;\n" +
                "d. string x=”10″; \n" +
                "Vui lòng chọn 1 trong các đáp án sau: ");
        String answer = scanner.nextLine();
        switch (answer) {
            case "a" :
                System.out.println("Đáp án chưa chính xác");
                break;
            case "b" :
                System.out.println("Đáp án chưa chính xác");
                break;
            case "c" :
                System.out.println("Đáp án chính xác");
                break;
            case "d" :
                System.out.println("Đáp án chưa chính xác");
                break;
            default:
                System.out.println("Đáp án không hợp lệ");
        }
    }
}
