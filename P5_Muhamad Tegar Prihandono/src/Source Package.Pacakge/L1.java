import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class L1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int jumlahData = 0;
        int[] dataArray;

        try {
            System.out.print("Masukkan jumlah data: ");
            jumlahData = Integer.parseInt(dataIn.readLine());

            dataArray = new int[jumlahData];

            // Input data ke array
            System.out.println("\nMasukkan data:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.print("Data ke-" + i + ": ");
                dataArray[i] = Integer.parseInt(dataIn.readLine());
            }

            // Menampilkan data
            System.out.println("\nIsi Array:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("Data[" + i + "] = " + dataArray[i]);
            }

            // Mencari nilai maksimum & minimum
            int max = dataArray[0];
            int min = dataArray[0];

            for (int i = 1; i < jumlahData; i++) {
                if (dataArray[i] > max) {
                    max = dataArray[i];
                }
                if (dataArray[i] < min) {
                    min = dataArray[i];
                }
            }

            System.out.println("\nNilai Maksimum: " + max);
            System.out.println("Nilai Minimum: " + min);

            // Sorting (Bubble Sort)
            for (int i = 0; i < jumlahData - 1; i++) {
                for (int j = 0; j < jumlahData - i - 1; j++) {
                    if (dataArray[j] > dataArray[j + 1]) {
                        int temp = dataArray[j];
                        dataArray[j] = dataArray[j + 1];
                        dataArray[j + 1] = temp;
                    }
                }
            }

            // Menampilkan hasil sorting
            System.out.println("\nData setelah diurutkan:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.print(dataArray[i] + " ");
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input!");
        }
    }
}