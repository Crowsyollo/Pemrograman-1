import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int presensi; int realisasi; int nilaiTugas; int nilaiUTS; int nilaiUAS; int total; int jumlahPresensi; int jumlahnilaiTugas; int jumlahnilaiUTS; int jumlahnilaiUAS; int jumlahTotal;
    System.out.print("masukkan jumlah presensi = ");
    presensi = input.nextByte();
    System.out.print("masukkan jumlah nilai realisasi = ");
    realisasi = input.nextByte();
    System.out.print("masukkan jumlah nilai tugas = ");
    nilaiTugas = input.nextByte();
    System.out.print("masukkan jumlah nilai UTS = ");
    nilaiUTS = input.nextByte();
    System.out.print("masukkan jumlah nilai UAS = ");
    nilaiUAS = input.nextByte();

    jumlahPresensi = presensi/realisasi*10;
    jumlahnilaiTugas = nilaiTugas*20/100;
    jumlahnilaiUTS = nilaiUTS*30/100;
    jumlahnilaiUAS = nilaiUAS*40/100;
    jumlahTotal = jumlahPresensi+jumlahnilaiTugas+jumlahnilaiUTS+jumlahnilaiUAS;

    System.out.print("\nNilai presensi mahasiswa = "+presensi+"\n");
    System.out.print("Nilai tugas mahasiswa = "+jumlahnilaiTugas+"\n");
    System.out.print("Nilai UTS mahasiswa = "+jumlahnilaiUTS+"\n");
    System.out.print("Nilai UAS mahasiswa = "+jumlahnilaiUAS+"\n");
    System.out.print("Nilai total mahasiswa = "+jumlahTotal);
    }
}

