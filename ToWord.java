import java.util.Scanner;

public class ToWord {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        while (user.hasNext()) {
            int inputNumber = user.nextInt();
            String word = number2Word(inputNumber);
            System.out.println(word);
        }
    }

    public static String number2Word(int inputNumber) {

        if(inputNumber > 100) return "-";
        else if(inputNumber == 100) return "seratus";

        String str = "";

        String[] word = new String[100];
        word[0] = "nol"; 
        word[1] = "satu"; 
        word[2] = "dua"; 
        word[3] = "tiga"; 
        word[4] = "empat"; 
        word[5] = "lima"; 
        word[6] = "enam"; 
        word[7] = "tujuh"; 
        word[8] = "delapan"; 
        word[9] = "sembilan";

        int x = 10;
        for(int i = 1; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                word[x] = inputNumber > 9 && inputNumber < 20 ? inputNumber == 10 ? "sepuluh" : inputNumber == 11 ? "sebelas" : word[j] + " belas" : j == 0 ? word[i] + " puluh" : word[i] + " puluh " + word[j];
                x++;
            }
        }

        for(int i = 0; i < word.length; i++) {
            if(inputNumber == i) str = word[i];
        }

        return str;
    }
}