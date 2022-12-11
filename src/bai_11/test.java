package bai_11;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GVThinhGiang tg = new GVThinhGiang("Duc", "QO", 1);
        tg.input(s);
        System.out.println("Thong tin giang vien");
        tg.output();
        GVCoHuu ch = new GVCoHuu("Chi", "Quoc Oai", 2);
        ch.input(s);
        System.out.println("Thong tin giang vien");
        ch.output();
    }
}
