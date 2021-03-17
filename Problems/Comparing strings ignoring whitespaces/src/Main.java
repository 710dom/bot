import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            String input1Clean = input1.replace(" ", "");
            String input2Clean = input2.replace(" ", "");
            System.out.println(input1Clean.equals(input2Clean));
        }
    }
}