package TGS1_C_12515;


public abstract class Ujian
{
    private String jenisUjian;
    private String namaPeserta;
    private int jumlahSoal;
    private int jawabanBenar;

    public Ujian(){
        jenisUjian = "Ujian mengemudi tertulis";
        namaPeserta = "SpongeBob";
        jumlahSoal = 20;
        jawabanBenar = 15;
    }

    public Ujian(String jenisUjian, String namaPeserta, int jumlahSoal, int jawabanBenar)
    {
        this.jenisUjian = jenisUjian;
        this.namaPeserta = namaPeserta;
        this.jumlahSoal = jumlahSoal;
        this.jawabanBenar = jawabanBenar;
    }
    
    public String getJenisUjian() {
        return jenisUjian;
    }
    
    public void setJenisUjian(String jenisUjian) {
        this.jenisUjian = jenisUjian;
    }
    
    public String getNamaPeserta() {
        return namaPeserta;
    }
    
    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }
    
    public int getJumlahSoal() {
        return jumlahSoal;
    }
    
    public void setJumlahSoal(int jumlahSoal) {
        this.jumlahSoal = jumlahSoal;
    }
    
    public int getJawabanBenar() {
        return jawabanBenar;
    }
    
    public void setJawabanBenar(int jawabanBenar) {
        this.jawabanBenar = jawabanBenar;
    }
    
    public int nilai()
    {
        if (this.jumlahSoal == 0) {
            return 0; // Hindari pembagian oleh nol
        }
        return (this.jawabanBenar * 100) / this.jumlahSoal;
    }
    
    public void tampilkanData(){
        System.out.println("Jenis Ujian: " + jenisUjian);
        System.out.println("Nama Peserta: " + namaPeserta);
        System.out.println("Jumlah Soal: " + jumlahSoal);
        System.out.println("Jumlah Jawaban Benar: " + jawabanBenar);
        System.out.println("Nilai Ujian: " + nilai());
    }
}
