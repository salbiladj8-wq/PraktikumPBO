package JS3.Tugas;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        while (kontainerAlfa.getBeratMuatanSaatIni() == 0) {
            System.out.print("Masukkan berat muatan baru yang ingin ditambahkan (kg): ");
            double inputTambah = in.nextDouble();
            System.out.println("Memasukkan muatan baru seberat " + inputTambah + " kg...");
            kontainerAlfa.tambahMuatan(inputTambah);
            System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");
        }

        boolean selesai = false;
        while (!selesai) {
            System.out.print("Masukkan berat muatan yang ingin dibongkar/diturunkan (kg): ");
            double inputTurun = in.nextDouble();
            System.out.println("Membongkar muat/menurunkan barang seberat " + inputTurun + " kg...");
            
            double muatanAwal = kontainerAlfa.getBeratMuatanSaatIni();
            kontainerAlfa.turunkanMuatan(inputTurun);
            System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg\n");

            if (kontainerAlfa.getBeratMuatanSaatIni() < muatanAwal) {
                selesai = true;
            }
        }

        in.close();
    }
}
