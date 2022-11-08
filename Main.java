import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tendik t1 = new Tendik("43242", "Cristiano Ronaldo", "Funchal, Madeira, Portugal", "5 Februari 1985", "Laki-Laki", 2005);
        t1.setJamLembur(20);
        System.out.println("Tendik");
        t1.cetak();

        System.out.println("=============================================\n");

        Dosen d1 = new Dosen("98879", "Elon Musk", "Pretorian, Afrika Selatan", "28 Juni 1971", "Laki-laki", 2011,
                "Informatika", "2100018165");
        d1.setSksLebih(6);
        System.out.println("Dosen");
        d1.cetak();
    }
}
