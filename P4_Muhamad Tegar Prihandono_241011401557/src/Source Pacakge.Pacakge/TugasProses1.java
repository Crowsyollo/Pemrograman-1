import java.util.Scanner;
public class TugasProses1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    String fauzan = "fauzan";
    String haikal = "haikal";
    String zidan = "zidan";
    int jumlahUangFauzan; int jumlahUanghutangHaikalFauzan; int jumlahUangHutangZidanFauzan; int jumlahTotal;
        System.out.print("masukkan jumlah uang Fauzan = ");
        jumlahUangFauzan = input.nextByte();
        System.out.print("masukkan jumlah Hutang Fauzan ke Haikal = ");
        jumlahUanghutangHaikalFauzan = input.nextByte();
        System.out.print("masukkan jumlah Hutang Fauzan ke zidan = ");
        jumlahUangHutangZidanFauzan = input.nextByte();

        jumlahTotal = jumlahUangFauzan-jumlahUanghutangHaikalFauzan-jumlahUangHutangZidanFauzan;

        System.out.print("Nilai total Uang Sisa Fauzan = "+jumlahTotal);
    }
}