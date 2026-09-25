package Kuis;

public class Main {
    public static void main(String[] args) {
    Dosen d1 = new Dosen("0011223344", "Dr. Ayu");
    Dosen d2 = new Dosen("0055667788", "Ir. Bima, M.T.");

    Skripsi s1 = new Skripsi( "Sistem Parkir Berbasis IoT", "Andi", d1, d2);
    Skripsi s2 = new Skripsi("Chatbot Layanan Akademik", "Sari", d2);

    System.out.println(s1.info());

    System.out.println("Sebelum menambah pembimbing 2:");
    System.out.println(s2.info());

    s2.setPembimbing2(d2);
    s2.setPembimbing2(d1);

    System.out.println(s2.info());
    }
}
