public class Gezegen {
    private int siraNumarasi;
    private String adi;
    private double uzaklik; // km cinsinden uzaklık
    private double yaricap; // km cinsinden yarıçap
    private double donmeSuresi; // gün cinsinden dönme süresi

    public Gezegen(int siraNumarasi, String adi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.adi = adi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    @Override
    public String toString() {
        return String.format("%s - Sıra Numarası: %d, Uzaklık: %.2f km, Yarıçap: %.2f km, Dönme Süresi: %.2f gün",
                adi, siraNumarasi, uzaklik, yaricap, donmeSuresi);
    }

    // Örnek
    public static void main(String[] args) {
        Gezegen merkur = new Gezegen(1, "Merkür", 57, 24, 58.6);
        Gezegen venus = new Gezegen(2, "Venüs", 10, 60, 243);
        Gezegen dunya = new Gezegen(3, "Dünya", 14, 63, 1);
        Gezegen mars = new Gezegen(4, "Mars", 22, 33, 1.03);

        System.out.println(merkur);
        System.out.println(venus);
        System.out.println(dunya);
        System.out.println(mars);
    }
}
