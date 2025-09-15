package TGS1_C_12515;


public class Bangunan
{
    private String namaBangunan;
    private int panjang;
    private int lebar;
    private String lokasi;

    public Bangunan(){
        namaBangunan = "KrustyKrab";
        panjang = 10; //dalam meter
        lebar = 15; //dalam meter
        lokasi = "Bikini Bottom";
    }

    public Bangunan(String namaBangunan, int panjang, int lebar, String lokasi)
    {
        this.namaBangunan = namaBangunan;
        this.panjang = panjang;
        this.lebar = lebar;
        this.lokasi = lokasi;
    }

    public String getNamaBangunan() {
        return namaBangunan;
    }
    
    public void setNamaBangunan(String namaBangunan) {
        this.namaBangunan = namaBangunan;
    }
    
    public int getPanjang() {
        return panjang;
    }
    
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public String getLokasi() {
        return lokasi;
    }
    
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public int luasBangunan()
    {
        return this.panjang * this.lebar;
    }
    
    public void tampilkanData(){
        System.out.println("Nama Bangunan: " + namaBangunan);
        System.out.println("Panjang Bangunan: " + panjang);
        System.out.println("Lebar Bangunan: " + lebar);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Luas bangunan: " + luasBangunan());
    }
}
