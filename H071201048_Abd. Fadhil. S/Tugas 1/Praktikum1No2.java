import java.util.Scanner;
public class Praktikum1No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Detik :");
        int d = input.nextInt();
        int detik;
        int menit;
        int jam;
        jam = d/3600;
        menit = (d % 3600)/60;
        detik = (d % 3600) % 60;
    
        //System.out.println(  jam +  (":") + menit +  (":") + detik );
        System.out.printf("%02d : %02d : %02d", jam, menit, detik);

    }

    
    
}
