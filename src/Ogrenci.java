public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano=0.0;
    private int girisyili=2021;
    private String bolumKodu="130";

    public String getAd() {
        return ad;
    }

    public String getBolum() {
        return bolum;
    }

    public double getGano() {
        return gano;
    }

    public Ogrenci(Ogrenci ogrenci) {
        this(ogrenci.ad,ogrenci.bolum,ogrenci.gano,ogrenci.bolumKodu,ogrenci.girisyili);
    }

    public Ogrenci() {
    }

    public Ogrenci(String ad,String bolum) {
        this.ad=ad;
        this.bolum=bolum;
    }

    public Ogrenci(String ad, String bolum, double gano, String bolumKodu, int girisYili) {
        if (girisYili<1000||girisYili>9999)
            throw new IllegalArgumentException("GirişYılı Geçersiz");
        if (gano<0||gano>4)
            throw new IllegalArgumentException("Gano Geçersiz");
        this.ad=ad;
        this.bolum=bolum;
        this.gano=gano;
        this.bolumKodu=bolumKodu;
        this.girisyili=girisYili;
    }

    public double harcHesapla(int dersSayici) {
        int dersUcreti=450;
        return dersUcreti*dersSayici;
    }

    public double harcHesapla(int dersSayici, double uzatilanYil) {
        int dersUcreti=450;
        return dersUcreti*dersSayici*uzatilanYil;
    }

    public String ogrenciNoOlustur() {
        int bolumKoduInt = Integer.parseInt(bolumKodu);
        return Integer.toString((girisyili * 1000000) + (bolumKoduInt * 1000) + 1);

    }


}


