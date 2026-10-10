package JS6;

public class Main {
    public static void main(String[] args) {
        Manusia manusia;
        Dosen dosen = new Dosen();
        dosen.lembur();
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tidur();

        manusia = new Dosen();
        manusia.bernafas(); 
        manusia.makan();    

        System.out.println("-----------------------------------");

        manusia = new Mahasiswa();
        manusia.bernafas(); 
        manusia.makan();    
    }
}
