package week_9_object.MyField;

import java.util.Date;

public class BankaHesabı {
    Date date = new Date();

    static double[] hesapİşleri = new double[10000];
    int i;
    private String hesapNo;
    private double bakiye;

    BankaHesabı(String hesapNo) {
        this.hesapNo = hesapNo;
        this.bakiye = 0;
    }

    public void paraYatır(double miktar) {
        bakiye += miktar;
        hesapİşleri[i] = miktar;


        i++;
    }

    public void paraÇek(double miktar) {

        if (bakiye > miktar) {
            bakiye -= miktar;
            hesapİşleri[i] = (-1 * miktar);

            i++;

        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public double bakiyeyiGöster() {
        return bakiye;
    }

    public void hesapHareketleri() {
        for (int j = 0; j < i; j++) {
            System.out.println(date.toString()+ "tarihinde " + Math.abs(hesapİşleri[j])+(hesapİşleri[j] <0?" TL çekildi.": " TL yatırıldı."));

        }
        System.out.println("Güncel Bakiye : " + bakiye);
    }

}
