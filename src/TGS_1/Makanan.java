package TGS1_C_12515;


public class Makanan
{
    private String namaMakanan;
    private String jenisMakanan;
    private int harga;
    private int jumlah;

    public Makanan(){
        namaMakanan = "Krabby Patty";
        jenisMakanan = "burger";
        harga = 20000;
        jumlah = 3;
    }

    public Makanan(String namaMakanan, String jenisMakanan, int harga, int
    jumlah)
    {
        this.namaMakanan = namaMakanan;
        this.jenisMakanan = jenisMakanan;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }
    
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }
    
    public String getJenisMakanan() {
        return jenisMakanan;
    }
    
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int totalHarga()
    {
        return this.harga * this.jumlah;
    }
    
    public void tampilkanData(){
        System.out.println("Nama Makanan: " + namaMakanan);
        System.out.println("Jenis Makanan: " + jenisMakanan);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total harga: " + totalHarga());
    }
}
