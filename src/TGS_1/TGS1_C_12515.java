
package TGS1_C_12515;

import java.io.*;

public class TGS1_C_12515 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Membuat objek Penduduk
        Penduduk penduduk1 = new Penduduk();
        System.out.println("\nMasukkan data penduduk bikini bottom:");
        System.out.print("Nama: ");
        String nama = br.readLine();
        System.out.print("Pekerjaan: ");
        String pekerjaan = br.readLine();
        System.out.print("Gaji Perjam: ");
        int gaji_perjam = Integer.parseInt(br.readLine());
        System.out.print("Waktu bekerja (dalam satuan jam perhari): ");
        int waktu_bekerja = Integer.parseInt(br.readLine());
        Penduduk penduduk2 = new Penduduk(nama, pekerjaan, gaji_perjam, waktu_bekerja);

        // Membuat objek Makanan
        Makanan makanan1 = new Makanan();
        System.out.println("\nMasukkan data untuk Makanan:");
        System.out.print("Nama Makanan: ");
        String namaMakanan = br.readLine();
        System.out.print("Jenis Makanan: ");
        String jenisMakanan = br.readLine();
        System.out.print("Harga: ");
        int harga = Integer.parseInt(br.readLine());
        System.out.print("Jumlah: ");
        int jumlah = Integer.parseInt(br.readLine());
        Makanan makanan2 = new Makanan(namaMakanan, jenisMakanan, harga, jumlah);

        // Membuat objek Bangunan
        Bangunan bangunan1 = new Bangunan();
        System.out.println("\nMasukkan data untuk Bangunan:");
        System.out.print("Nama Bangunan: ");
        String namaBangunan = br.readLine();
        System.out.print("Panjang bangunan (dalam meter): ");
        int panjang = Integer.parseInt(br.readLine());
        System.out.print("Lebar bangunan (dalam meter): ");
        int lebar = Integer.parseInt(br.readLine());
        System.out.print("Lokasi: ");
        String lokasi = br.readLine();
        Bangunan bangunan2 = new Bangunan(namaBangunan, panjang, lebar, lokasi);

        // Membuat objek Ujian
        Ujian ujian1 = new Ujian() {};
        System.out.println("\nMasukkan data untuk Ujian:");
        System.out.print("Jenis Ujian: ");
        String jenisUjian = br.readLine();
        System.out.print("Nama Peserta: ");
        String namaPeserta = br.readLine();
        System.out.print("Jumlah Soal: ");
        int jumlahSoal = Integer.parseInt(br.readLine());
        System.out.print("Jumlah Jawaban Benar: ");
        int jawabanBenar = Integer.parseInt(br.readLine());
        Ujian ujian2 = new Ujian(jenisUjian, namaPeserta, jumlahSoal, jawabanBenar) {};

        // Menampilkan data Penduduk
        System.out.println("\nData Penduduk Bikini Bottom 1:");
        penduduk1.tampilkanData();

        System.out.println("\nData Penduduk Bikini Bottom 2:");
        penduduk2.tampilkanData();

        // Menampilkan data Makanan
        System.out.println("\nData Makanan 1:");
        makanan1.tampilkanData();

        System.out.println("\nData Makanan 2:");
        makanan2.tampilkanData();

        // Menampilkan data Bangunan
        System.out.println("\nData Bangunan 1:");
        bangunan1.tampilkanData();

        System.out.println("\nData Bangunan 2:");
        bangunan2.tampilkanData();

        // Menampilkan data Ujian
        System.out.println("\nData Ujian 1:");
        ujian1.tampilkanData();

        System.out.println("\nData Ujian 2:");
        ujian2.tampilkanData();
    }
    
}
