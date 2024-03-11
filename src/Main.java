public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenci = {
                new Ogrenci(),
                new Ogrenci("Doğukan", "Bilgisayar Müh.", 0, "104", 2022),
                new Ogrenci("Selin", "Mimarlık", 1, "104", 1970),
                new Ogrenci("Sevin", "Diş Hekimliği", 1.78, "104", 2020),
        };
        Ogrenci ogrenci4=new Ogrenci(ogrenci[3]);
        System.out.println("Öğrencilerin Bilgileri");
        for (int i = 0; i < 3; i++) {
            System.out.printf("OGR-%s %s %s %s %s %n",i+1,ogrenci[i].getAd(),ogrenci[i].getBolum(),ogrenci[i].ogrenciNoOlustur(),ogrenci[i].getGano());
        }
        System.out.printf("OGR-%s %s %s %s %s %n",4,ogrenci4.getAd(),ogrenci4.getBolum(),ogrenci4.ogrenciNoOlustur(),ogrenci4.getGano());


        System.out.printf("3.Öğrencinin ödeyeceği harç: %s%n",ogrenci[2].harcHesapla(6));
        System.out.printf("4.Öğrencinin ödeyeceği harç: %s%n",ogrenci[3].harcHesapla(4,2.0));

    }

}