import java.util.Scanner;

public class Main {
    public static void printGlasses(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                if(i == 1 || i == n || j == 1 || j == n*2) {
                    System.out.print("* ");
                }else{
                    System.out.print("/ ");
                }
            }
                for (int k = 1; k <= n; k++) {
                    if(i == 2) {
                        System.out.print("| ");
                    }else{
                        System.out.print("  ");
                    }
                }
                for (int r = 1; r <= n * 2; r++) {
                    if(i == 1 || i == n || r == 1 || r == n*2) {
                        System.out.print("* ");
                    }else{
                        System.out.print("/ ");
                    }
                }
                System.out.println();

            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = scanner.nextInt();
        printGlasses(n);

    }
}