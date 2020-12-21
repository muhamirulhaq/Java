import java.util.Scanner;
public class No13{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int banyakkasus=read.nextInt();
        int totalnilai;
        float average;
        int[] muridkasus=new int[banyakkasus];
        for(int i=0;i<banyakkasus;i++){
            int banyakmurid=read.nextInt();
            totalnilai=0;
            int[] nilai=new int[banyakmurid];
            for(int j=0;j<nilai.length;j++){
                nilai[j]=read.nextInt();
                totalnilai += nilai[j];
            }
            average=(float) totalnilai/banyakmurid;
            for(int k=0;k<nilai.length;k++){
                if(nilai[k]<average){
                    muridkasus[i] += 1;
                }
            }
        }
        read.close();
        System.out.println(" ");
        for(int a : muridkasus){
            System.out.println(a);
        }
    }
}