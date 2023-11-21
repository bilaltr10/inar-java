package week_9_object.MyField;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class testOf_BankaHesabı {
    public static void main(String[] args) {
        BankaHesabı bankaHesabı = new BankaHesabı("125456");
        bankaHesabı.paraYatır(124);
        bankaHesabı.paraYatır(5645);
        bankaHesabı.paraÇek(500);
        bankaHesabı.paraYatır(5645);
        bankaHesabı.paraÇek(500);
        bankaHesabı.paraYatır(5645);
        bankaHesabı.paraÇek(4521);
        bankaHesabı.paraÇek(8500);
        bankaHesabı.paraÇek(521);
        bankaHesabı.paraYatır(8475);

        bankaHesabı.hesapHareketleri();


    }
}
