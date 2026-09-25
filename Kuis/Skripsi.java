package Kuis;

public class Skripsi {
    private String judul;
    private String namaMahasiswa;
    private Dosen pembimbing1;
    private Dosen pembimbing2;

    public Skripsi(String judul, String namaMahasiswa, Dosen pembimbing1) {
        this.judul = judul;
        this.namaMahasiswa = namaMahasiswa;
        this.pembimbing1 = pembimbing1;
    }

    public Skripsi(String judul, String namaMahasiswa, Dosen pembimbing1, Dosen pembimbing2) {
        this(judul, namaMahasiswa, pembimbing1);
        if (pembimbing2 == pembimbing1) {
            System.out.println("pembimbing 2 tidak boleh sama dengan pembimbing 1");
        } else {
            this.pembimbing2 = pembimbing2;
        }
    }

    public Dosen getPembimbing1() {
        return pembimbing1;
    }

    public void setPembimbing1(Dosen pembimbing1) {
        this.pembimbing1 = pembimbing1;
    }

    public Dosen getPembimbing2() {
        return pembimbing2;
    }

    public void setPembimbing2(Dosen pembimbing2) {
        if (pembimbing2 == pembimbing1) {
            System.out.println("pembimbing 2 tidak boleh sama dengan pembimbing 1");
            return;
        }
        this.pembimbing2 = pembimbing2;
    }

    public String info() {
        String info = "Judul: " + judul + "\n";
        info += "Mahasiswa: " + namaMahasiswa + "\n";
        info += "Pembimbing 1: " + pembimbing1.info() + "\n";
        info += "Pembimbing 2: " + (pembimbing2 == null ? "-" : pembimbing2.info()) + "\n";
        return info;
    }
}
