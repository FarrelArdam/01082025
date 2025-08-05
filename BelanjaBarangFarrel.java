import java.util.Scanner;

public class BelanjaBarangFarrel {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang 1 : ");
        String namaBarang1 = input.nextLine();
        System.out.println("Masukkan Harga Satuan Barang 1: ");
        double hargaSatuan1 = input.nextDouble();

        input.nextLine(); // Consume newline
        System.out.println("Masukkan Nama Barang 2: ");
        String namaBarang2 = input.nextLine();
        System.out.println("Masukkan Harga Satuan Barang 2: ");
        double hargaSatuan2 = input.nextDouble();

        System.out.println("Barang 1 dan Barang 2 yang Anda beli adalah:");

        System.out.println("===========================");
        System.out.println("Nama Barang: " + namaBarang1);
        System.out.println("Harga Satuan: " + hargaSatuan1);

        System.out.println("Nama Barang 2: " + namaBarang2);
        System.out.println("Harga Satuan 2: " + hargaSatuan2);
        System.out.println("===========================");

        
    }
    
}
