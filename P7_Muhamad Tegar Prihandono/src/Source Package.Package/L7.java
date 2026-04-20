import java.util.Scanner;
import java.io.*;

public class L7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float kehadiran; float nilaiAkhir; float persentase;
        persentase = 21*75/100;

        System.out.print("masukkan jumlah kehadiran = ");
        kehadiran = input.nextFloat();
        System.out.print("masukkan jumlah nilai akhir = ");
        nilaiAkhir = input.nextFloat();

        if (kehadiran >= persentase) {
            if (nilaiAkhir >= 80) {
                System.out.println("nilai = "+nilaiAkhir+" Grade = A");
            } else if(nilaiAkhir >=70) {
                System.out.println("nilai = "+nilaiAkhir+" Grade = B");
            } else if(nilaiAkhir >=60) {
                System.out.println("nilai ="+nilaiAkhir+" Grade = C");
            } else if(nilaiAkhir >=50) {
                System.out.println("nilai = "+nilaiAkhir+" Grade = D");
            } else if(nilaiAkhir < 40) {
                System.out.println("nilai = " +nilaiAkhir+" Grade = E");
            }
        } else if (kehadiran < persentase) {
            if (nilaiAkhir >= 55) {
                    System.out.println("nilai = 55 Grade D");
            } else if (nilaiAkhir < 55) {
                    System.out.println("nilai = "+nilaiAkhir+" Grade E");
            }
        }
    }
}