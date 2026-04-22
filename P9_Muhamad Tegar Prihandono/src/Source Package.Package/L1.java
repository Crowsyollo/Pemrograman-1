interface Kendaraan {
    void jalan();
}

class Motor implements Kendaraan {

    public void jalan() {
        System.out.println("Motor berjalan");
    }
}

public class L1 {
    public static void main(String[] args) {

        Motor m = new Motor();
        m.jalan();
    }
}