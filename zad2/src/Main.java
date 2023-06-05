import java.util.Scanner;
import java.util.SortedMap;

/*
При въведен текст от потребителя, кажете дали започва и свършва по огледален начин. Например
Akara - да, започва и свършва с “а”
Ba123ab - да, започва с “ba” и свършва с “ab”
A5c21b - не, започва с “a”, а завършва с “b”
Принтирайте какъв е повтарящият се участък, но нека бъде само малки букви. Т.е.
Изведете “a” за първия пример или “ba” за втория.
Ако няма част, която да е огледална - принтирайте “No mirrored part”.*/
public class Main {
    public static void printResult(String wordFromChecker){
        if (wordFromChecker==null){
            System.out.println("No mirrored part!");
        }else{
            StringBuilder stringBuilder = new StringBuilder(wordFromChecker);
            stringBuilder.reverse();
            System.out.println("Yes,starts with "+wordFromChecker+" and ends with "+stringBuilder);
        }
    }
    public static String checkForRepeatingChars(String word) {
        String firstPartOfWord, secondPartOfWord;
        int wordLenght = word.length();
        for (int i = 0; i < word.length(); i++) {
            secondPartOfWord = word.substring((word.length() / 2) + i);
            if (wordLenght % 2 == 0) {
                firstPartOfWord = word.substring(0, (word.length() / 2) - i);
                StringBuilder stringBuilder = new StringBuilder(secondPartOfWord);
                stringBuilder.reverse();
                secondPartOfWord = stringBuilder.toString();
               if (firstPartOfWord.equalsIgnoreCase(secondPartOfWord)) {
                    return firstPartOfWord;
                }
            }else{
                firstPartOfWord = word.substring(0, (word.length() / 2) - i+1);
                StringBuilder stringBuilder = new StringBuilder(secondPartOfWord);
                stringBuilder.reverse();
                secondPartOfWord = stringBuilder.toString();
                if (firstPartOfWord.equalsIgnoreCase(secondPartOfWord)) {
                    return firstPartOfWord;
                }
            }

        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word for mirror inspection: ");
        String wordForInspection = scanner.next();
        String word = checkForRepeatingChars(wordForInspection);
        printResult(word);
    }
}