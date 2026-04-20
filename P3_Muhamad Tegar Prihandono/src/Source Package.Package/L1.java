import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        System.out.println("Halo " + nama + ", umur kamu " + umur + " tahun");
    }
}