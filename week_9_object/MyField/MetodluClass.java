package week_9_object.MyField;

public class MetodluClass {
    private int sayi;

    // 1. Metod: Yapıcı metot
    public MetodluClass(int sayi) {
        this.sayi = sayi;
    }

    // 2. Metod: Sayıyı getir
    public int getSayi() {
        return sayi;
    }

    // 3. Metod: Sayıyı artır
    public void sayiArtir(int artis) {
        sayi += artis;
    }

    // 4. Metod: Sayıyı azalt
    public void sayiAzalt(int azalis) {
        sayi -= azalis;
    }

    // 5. Metod: Sayıyı sıfırla
    public void sayiSifirla() {
        sayi = 0;
    }

    // 6. Metod: Sayının karesini hesapla
    public int kareHesapla() {
        return sayi * sayi;
    }

    // 7. Metod: Sayının faktöriyelini hesapla
    public long faktoriyelHesapla() {
        if (sayi < 0) {
            return -1; // Negatif sayıların faktöriyeli tanımsızdır.
        } else if (sayi == 0 || sayi == 1) {
            return 1;
        } else {
            long faktoriyel = 1;
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }
            return faktoriyel;
        }
    }
}

