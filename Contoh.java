import java.util.Scanner;

public class Contoh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        int modusFrequence[] = new int[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(num[i] == num[j]) {
                    modusFrequence[i]++;
                }
            }
        }

        int modus = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(modusFrequence[i] == modusFrequence[j]) continue;
                if(modusFrequence[i] > modusFrequence[j]) {
                    modus = num[i];
                    break;
                }
            }
        }

        System.out.println(modus);
    }
}

// int modus = 0;
// for(int i = 0; i < n; i++) {
//     if(modusFrequence[i] >= modus) {
//         modus = num[i];
//     }
// }

// System.out.println(modus);
//     }
// }