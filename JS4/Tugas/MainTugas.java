package JS4.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Pasien pasien = new Pasien("Caca", "Demam", "Flu Ringan");

        Resep resepObat = new Resep("Paracetamol", "3x1 Sehari");
        pasien.setResep(resepObat);

        PrinterNota printer = new PrinterNota();
        pasien.cetakNota(printer);
    }
}
