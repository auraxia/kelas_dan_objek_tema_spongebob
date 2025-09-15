package TGS1_C_12515;


public class Penduduk
{
    private String nama;
    private String pekerjaan;
    private int gaji_perjam;
    private int waktu_bekerja;
    
    public Penduduk(){
        nama = "SpongeBob";
        pekerjaan = "Koki";
        gaji_perjam = 150000;
        waktu_bekerja = 8; //jam perhari
    }

    public Penduduk(String nama, String pekerjaan, int gaji_perjam, int waktu_bekerja)
    {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.gaji_perjam = gaji_perjam;
        this.waktu_bekerja = waktu_bekerja;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getPekerjaan() {
        return pekerjaan;
    }
    
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
    public int getGajiPerjam() {
        return gaji_perjam;
    }
    
    public void setGajiPerjam(int gaji_perjam) {
        this.gaji_perjam = gaji_perjam;
    }
    
    public int getWaktuBekerja() {
        return waktu_bekerja;
    }
    
    public void setWaktuBekerja(int waktu_bekerja) {
        this.waktu_bekerja = waktu_bekerja;
    }
    
    public int totalGaji()
    {
        return this.gaji_perjam * this.waktu_bekerja; 
    }
    
    public void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji perjam: " + gaji_perjam);
        System.out.println("Waktu bekerja (dalam satuan jam perhari): " + waktu_bekerja);
        System.out.println("Total gaji: " + totalGaji());
    }
}
