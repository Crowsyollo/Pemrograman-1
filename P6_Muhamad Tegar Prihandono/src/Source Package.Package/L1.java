public class L1 {

    private String nama;
    private int umur;
    private double nilai;

    public void setNama(String nama) {
        this.nama = nama; // pakai this
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getNilai() {
        return nilai;
    }

    public String getStatus() {
        if (nilai >= 75) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Nilai : " + nilai);
        System.out.println("Status : " + getStatus());
    }

    public void tampilData(String tambahan) {
        System.out.println("=== DATA MAHASISWA ===");
        tampilData();
        System.out.println("Keterangan : " + tambahan);
    }

    public static void main(String[] args) {

        L1 mhs1 = new L1();

        mhs1.setNama("Tegar");
        mhs1.setUmur(20);
        mhs1.setNilai(85);

        mhs1.tampilData();

        System.out.println();

        mhs1.tampilData("Mahasiswa Aktif");
    }
}