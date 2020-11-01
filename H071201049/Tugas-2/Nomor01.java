import java.util.Scanner;

class Nomor01 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e, genap = 0, ganjil = 0, positif = 0, negatif = 0;
        try {
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            d = scan.nextInt();
            e = scan.nextInt();

            //UNTUK NILAI A
            if(a<=0){
                if(a<0)
                    negatif++;
                if(a%2==0) 
                    genap++;
                else
                    ganjil++;
            } else {
                positif++;
                if(a%2==0)
                    genap++;
                else
                    ganjil++;
            }

            //UNTUK NILAI B
             if(b<=0){
                if(b<0)
                    negatif++;
                if(b%2==0)
                    genap++;
                else
                    ganjil++;
            } else {
                positif++;
                if(b%2==0)
                    genap++;
                else
                    ganjil++;
            }

            //UNTUK NILAI C
             if(c<=0){
                if(c<0)
                    negatif++;
                if(c%2==0)
                    genap++;
                else
                    ganjil++;
            } else {
                positif++;
                if(c%2==0)
                    genap++;
                else
                    ganjil++;
            }

            //UNTUK NILAI D
             if(d<=0){
                if(d<0)
                    negatif++;
                if(d%2==0)
                    genap++;
                else
                    ganjil++;
            } else {
                positif++;
                if(d%2==0)
                    genap++;
                else
                    ganjil++;
            }

            //UNTUK NILAI E
             if(e<=0){
                if(e<0)
                    negatif++;
                if(e%2==0)
                    genap++;
                else if(e==0)
                    genap++;
                else
                    ganjil++;
            } else {
                positif++;
                if(e%2==0)
                    genap++;
                else
                    ganjil++;
            }
            System.out.println(genap + " Angka Genap");
            System.out.println(ganjil + " Angka Ganjil");
            System.out.println(positif + " Angka Positif");
            System.out.println(negatif + " Angka Negatif");
        } catch (Exception er) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}
