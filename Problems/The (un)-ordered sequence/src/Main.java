import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean upWardFlag = true;
            boolean downWardFlag = true;
            int input1 = scanner.nextInt();

            while (true) {
                int input2 = scanner.nextInt();
                if (input2 == 0) {
                    break;
                }
                if (input1 > input2) {
                    upWardFlag = false;
                } else if (input1 < input2) {
                    downWardFlag = false;
                }
                input1 = input2;
            }
            System.out.println(upWardFlag || downWardFlag);
        }
    }
}