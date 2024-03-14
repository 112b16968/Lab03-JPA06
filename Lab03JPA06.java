import java.util.Scanner;

public class Lab03JPA06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input:");
            String twoString = input.nextLine();
            String numbers[] = twoString.split("\\s++");
            if (Integer.parseInt(numbers[0]) == 999) {
                break;
            } else {
                int m = Integer.parseInt(numbers[0]);
                int n = Integer.parseInt(numbers[1]);
                double result = Math.pow(n, m);
                System.out.printf("%d\n", Math.round(result));
            }
        }
        input.close(); // 將關閉 Scanner 對象的程式碼移到迴圈之外
    }
}

