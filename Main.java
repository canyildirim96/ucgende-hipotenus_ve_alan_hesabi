import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        double kisaKenar, uzunKenar,  hipotenus, yuksekligi, alan;
        System.out.print("Kısa Kenar Değerini Giriniz: ");
        kisaKenar = inp.nextDouble();
        System.out.print("Uzun Kenar Değerini Giriniz: ");
        uzunKenar = inp.nextDouble();

        hipotenus = Math.sqrt((kisaKenar * kisaKenar) + (uzunKenar * uzunKenar));
        yuksekligi = (kisaKenar + uzunKenar + hipotenus) / 2;
        alan = (uzunKenar * yuksekligi) / 2;
        System.out.println("Hipotenüs Değeriniz: " + hipotenus);
        System.out.println("Üçgenin Yüksekliği: " + yuksekligi);
        System.out.println("Üçgenin Alanı: " + alan);














    }
}