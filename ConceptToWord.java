import java.util.Scanner;

public class ConceptToWord {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int inputNumber = user.nextInt();

        String[] word = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};

        for(int i = 0; i < word.length; i++) {
            if(inputNumber == i) System.out.println(word[i]);
        }

        user.close();
    }
}