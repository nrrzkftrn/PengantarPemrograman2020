import java.util.Scanner;
public class Praktikum1No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Waktu Tempuh");
        
        System.out.println("Masukkan Jarak Tempuh");
        
        int waktu = input.nextInt();
        int jarak = input.nextInt();
        float bensin;
        bensin = (waktu*jarak)/14f;

        System.out.println("Bensin Yang Digunakan :" + String.format("%.3f", bensin) + "L");
        //System.out.printf("Bensin yang digunakan : %.3f %d", bensin, jarak );

    }
    
}
