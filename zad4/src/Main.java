import java.io.PrintStream;
import java.util.Scanner;

/*Да се напише програма, която чете число n, въведено от потребителя, и печата
триъгълник от удивителни знаци (!) като в примерите:*/
public class Main {
    public static void createFile(int n) {
        try {
            PrintStream ps = new PrintStream("triangle.txt");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    ps.print("!");
                }
                ps.print(" \n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void printTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n= scanner.nextInt();
        printTriangle(n);
        createFile(n);
    }
}