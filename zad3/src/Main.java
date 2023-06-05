import java.util.Scanner;

/*При подаден стринг, пребройте думите завършващи на y и на z.*/
public class Main {
    public static void countWordWithYandZ(String words){
        String [] array =words.split(" ");
        String wordForCheck;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            wordForCheck=array[i];
            char test = wordForCheck.charAt(wordForCheck.length()-1);
            if("z".equalsIgnoreCase(String.valueOf(test)) ||"y".equalsIgnoreCase(String.valueOf(test))) {
                count++;
            }

        }
        System.out.println("Вords ending in y and z are "+count+" in number");

    }
    public static void main(String[] args) {

        countWordWithYandZ("fez day");
        countWordWithYandZ("day fyyyz");
        countWordWithYandZ("Dad fez");

    }
}