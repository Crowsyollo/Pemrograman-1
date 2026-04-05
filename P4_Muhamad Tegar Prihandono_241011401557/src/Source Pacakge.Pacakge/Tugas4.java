import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float makanSenin; float transportSenin; float belanjaSenin; float totalSenin; float persentaseMakanSenin; float persentaseTransportSenin; float persentaseBelanjaSenin; float makanSelasa; float transportSelasa; float belanjaSelasa; float totalSelasa; float persentaseMakanSelasa; float persentaseTransportSelasa; float persentaseBelanjaSelasa; float makanRabu; float transportRabu; float belanjaRabu; float totalRabu; float persentaseMakanRabu; float persentaseTransportRabu; float persentaseBelanjaRabu; float makanKamis; float transportKamis; float belanjaKamis; float totalKamis; float persentaseMakanKamis; float persentaseTransportKamis; float persentaseBelanjaKamis; float makanJumat; float transportJumat; float belanjaJumat; float totalJumat; float persentaseMakanJumat; float persentaseTransportJumat; float persentaseBelanjaJumat; float makanSabtu; float transportSabtu; float belanjaSabtu; float totalSabtu; float persentaseMakanSabtu; float persentaseTransportSabtu; float persentaseBelanjaSabtu; float makanMinggu; float transportMinggu; float belanjaMinggu; float totalMinggu; float persentaseMakanMinggu; float persentaseTransportMinggu; float persentaseBelanjaMinggu;
        System.out.print("Hari Senin\n");
        System.out.print("Masukan jumlah harga makan = ");
        makanSenin = input.nextFloat();
        System.out.print("Masukan jumlah harga transport = ");
        transportSenin = input.nextFloat();
        System.out.print("Masukan jumlah harga belanja = ");
        belanjaSenin = input.nextFloat();
        totalSenin = makanSenin+transportSenin+belanjaSenin;
        System.out.print("Total Uang Keluar Hari Senin = "+totalSenin);
        persentaseMakanSenin = makanSenin/totalSenin*100;
        persentaseTransportSenin = transportSenin/totalSenin*100;
        persentaseBelanjaSenin = belanjaSenin/totalSenin*100;
        System.out.print("\nPersentase Uang Keluar Hari Senin = \n Makan = "+persentaseMakanSenin+"%"+"\n Transport = "+persentaseTransportSenin+"%"+"\n Belanja = "+persentaseBelanjaSenin+"%\n");

        System.out.print("Hari Selasa\n");
        System.out.print("Masukan jumlah harga makan = ");
        makanSelasa = input.nextFloat();
        System.out.print("Masukan jumlah harga transport = ");
        transportSelasa = input.nextFloat();
        System.out.print("Masukan jumlah harga belanja = ");
        belanjaSelasa = input.nextFloat();
        totalSelasa = makanSelasa+transportSelasa+belanjaSelasa;
        System.out.print("Total Uang Keluar Hari Senin = "+totalSelasa);
        persentaseMakanSelasa = makanSelasa/totalSelasa*100;
        persentaseTransportSelasa = transportSelasa/totalSelasa*100;
        persentaseBelanjaSelasa = belanjaSelasa/totalSelasa*100;
        System.out.print("\nPersentase Uang Keluar Hari Senin = \n Makan = "+persentaseMakanSelasa+"%"+"\n Transport = "+persentaseTransportSelasa+"%"+"\n Belanja = "+persentaseBelanjaSelasa+"%\n");

        System.out.print("Hari Rabu\n");
        System.out.print("Masukan jumlah harga makan = ");
        makanRabu = input.nextFloat();
        System.out.print("Masukan jumlah harga transport = ");
        transportRabu = input.nextFloat();
        System.out.print("Masukan jumlah harga belanja = ");
        belanjaRabu = input.nextFloat();
        totalRabu = makanRabu+transportRabu+belanjaRabu;
        System.out.print("Total Uang Keluar Hari Senin = "+totalRabu);
        persentaseMakanRabu = makanRabu/totalRabu*100;
        persentaseTransportRabu = transportRabu/totalRabu*100;
        persentaseBelanjaRabu = belanjaRabu/totalRabu*100;
        System.out.print("\nPersentase Uang Keluar Hari Senin = \n Makan = "+persentaseMakanRabu+"%"+"\n Transport = "+persentaseTransportRabu+"%"+"\n Belanja = "+persentaseBelanjaRabu+"%\n");

        System.out.print("Hari Kamis\n");
        System.out.print("Masukan jumlah harga makan = ");
        makanKamis = input.nextFloat();
        System.out.print("Masukan jumlah harga transport = ");
        transportKamis = input.nextFloat();
        System.out.print("Masukan jumlah harga belanja = ");
        belanjaKamis = input.nextFloat();
        totalKamis = makanKamis+transportKamis+belanjaKamis;
        System.out.print("Total Uang Keluar Hari Senin = "+totalKamis);
        persentaseMakanKamis = makanKamis/totalKamis*100;
        persentaseTransportKamis = transportKamis/totalKamis*100;
        persentaseBelanjaKamis = belanjaKamis/totalKamis*100;
        System.out.print("\nPersentase Uang Keluar Hari Senin = \n Makan = "+persentaseMakanKamis+"%"+"\n Transport = "+persentaseTransportKamis+"%"+"\n Belanja = "+persentaseBelanjaKamis+"%\n");

        System.out.print("Hari Jumat\n");
        System.out.print("Masukan jumlah harga makan = ");
        makanJumat = input.nextFloat();
        System.out.print("Masukan jumlah harga transport = ");
        transportJumat = input.nextFloat();
        System.out.print("Masukan jumlah harga belanja = ");
        belanjaJumat = input.nextFloat();
        totalJumat = makanJumat+transportJumat+belanjaJumat;
        System.out.print("Total Uang Keluar Hari Senin = "+totalJumat);
        persentaseMakanJumat = makanJumat/totalJumat*100;
        persentaseTransportJumat = transportJumat/totalJumat*100;
        persentaseBelanjaJumat = belanjaJumat/totalJumat*100;
        System.out.print("\nPersentase Uang Keluar Hari Senin = \n Makan = "+persentaseMakanJumat+"%"+"\n Transport = "+persentaseTransportJumat+"%"+"\n Belanja = "+persentaseBelanjaJumat+"%\n");

        System.out.print("Hari Sabtu\n");
        System.out.print("Masukan jumlah harga makan = ");
        makanSabtu = input.nextFloat();
        System.out.print("Masukan jumlah harga transport = ");
        transportSabtu = input.nextFloat();
        System.out.print("Masukan jumlah harga belanja = ");
        belanjaSabtu = input.nextFloat();
        totalSabtu = makanSabtu+transportSabtu+belanjaSabtu;
        System.out.print("Total Uang Keluar Hari Senin = "+totalSabtu);
        persentaseMakanSabtu = makanSabtu/totalSabtu*100;
        persentaseTransportSabtu = transportSabtu/totalSabtu*100;
        persentaseBelanjaSabtu = belanjaSabtu/totalSabtu*100;
        System.out.print("\nPersentase Uang Keluar Hari Senin = \n Makan = "+persentaseMakanSabtu+"%"+"\n Transport = "+persentaseTransportSabtu+"%"+"\n Belanja = "+persentaseBelanjaSabtu+"%\n");

        System.out.print("Hari Minggu\n");
        System.out.print("Masukan jumlah harga makan = ");
        makanMinggu = input.nextFloat();
        System.out.print("Masukan jumlah harga transport = ");
        transportMinggu = input.nextFloat();
        System.out.print("Masukan jumlah harga belanja = ");
        belanjaMinggu = input.nextFloat();
        totalMinggu = makanMinggu+transportMinggu+belanjaMinggu;
        System.out.print("Total Uang Keluar Hari Senin = "+totalMinggu);
        persentaseMakanMinggu = makanMinggu/totalMinggu*100;
        persentaseTransportMinggu = transportMinggu/totalMinggu*100;
        persentaseBelanjaMinggu = belanjaMinggu/totalMinggu*100;
        System.out.print("\nPersentase Uang Keluar Hari Senin = \n Makan = "+persentaseMakanMinggu+"%"+"\n Transport = "+persentaseTransportMinggu+"%"+"\n Belanja = "+persentaseBelanjaMinggu+"%\n");

    }
}