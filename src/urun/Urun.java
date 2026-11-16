package urun;

public abstract class Urun{
    protected String ad;
    protected String urunKodu;
    protected double fiyat;
    protected int stokMiktari;
    protected String marka;

    public Urun(String ad, String urunKodu, double fiyat, int stokMiktari, String marka) {
        this.ad = ad;
        this.urunKodu = urunKodu;
        this.fiyat = fiyat;
        this.stokMiktari = stokMiktari;
        this.marka = marka;
    }
}