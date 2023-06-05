import java.util.Scanner;

/*Напишете програма, която чете цяло положително число n, въведено от
потребителя, и чертае на конзолата квадратна рамка с размер n * n като в примерите по-долу:*/
public class Main {
    public static void drawSquareFrame(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j==1) || (i == 1 && j==n) || (i == n && j == 1) || (i == n && j == n)) {
                    System.out.print("* ");
                } else if (j==1 || j==n) {
                    System.out.print("| ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num n: ");
        int n = scanner.nextInt();
        drawSquareFrame(n);

    }
}