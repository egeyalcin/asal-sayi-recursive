import java.util.Scanner;

public class AsalSayiRecursive {
    static boolean asalSayi() {
        double sayi, doubleSayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        sayi = inp.nextDouble();
        doubleSayi = sayi;
        double counter = 0;
        for (int i = 2; i < sayi ; i++) {
            if (sayi % i ==0) {
                System.out.println("Asal degil");
                return asalSayi();
                }
            else {
                System.out.println("Asal");
                return asalSayi();
            }
            }
        return asalSayi();
    }




    public static void main(String[] args) {
        asalSayi();
    }

}