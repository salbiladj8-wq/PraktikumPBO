package JS10.Percobaan1;

public class Main {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        ScholarshipStudent sStd = new ScholarshipStudent("Bayu", "KIP Kuliah");
        LabRental lab = new LabRental(3, "LAB-JARINGAN");

        Student s;
        Billable b;

        s = rStd; // Sah! RegularStudent is-a Student
        System.out.println("s = rStd");
        System.out.println(s.getStudentInfo());

        s = sStd; // Sah! ScholarshipStudent is-a Student
        System.out.println("s = sStd");
        System.out.println(s.getStudentInfo());

        b = rStd; // Sah! RegularStudent implements Billable
        System.out.println("b = rStd");
        System.out.println("Tagihan: " + b.getBillAmount());

        b = lab;  // Sah! LabRental implements Billable
        System.out.println("b = lab");
        System.out.println("Tagihan: " + b.getBillAmount());

        // Uji error kompilasi:
        // s = lab;
        // b = sStd;
    }
}
