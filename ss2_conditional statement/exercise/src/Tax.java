import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        //Viết một chương trình C++ để nhập lương nhân viên, tính thuế thu nhập và lương ròng (số tiền lương thực sự mà
        // nhân viên đó nhận được)
        // . Với các thông số giả sử như sau (không theo luật lương, chỉ là con số giả sử để dễ tính toán):
        //30% thuế thu nhập nếu lương là 15 triệu.
        //20% thuế thu nhập nếu lương từ 7 đến 15 triệu.
        //10% thuế thu nhập nếu lương dưới 7 triệu.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập lương tháng này của bạn : ");
        int salary = scanner.nextInt();
        int tax;
        int netSalary;
        if (salary < 7000000) {
            tax = salary * 10 / 100;
            netSalary = salary - tax;
            System.out.println("Lương con lại của bạn là : " + netSalary);
            System.out.println("Thuế của bạn là : " + tax);
        } else if (salary < 15000000) {
            tax = salary * 20 / 100;
            netSalary = salary - tax;
            System.out.println("Lương còn lại của bạn là : " + netSalary);
            System.out.println("Thuế của bạn là : " + tax);
        } else {
            tax = salary * 30 / 100;
            netSalary = salary - tax;
            System.out.println("Lương còn lại của bạn là : " + netSalary);
            System.out.println("Thuế của bạn là : " + tax);
        }
    }
}
