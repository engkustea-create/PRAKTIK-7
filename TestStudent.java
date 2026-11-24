import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student mhs = new Student(
                "Raka", "Putra", "Pratama", new Date(),
                "2401001", "Ilmu Komputer", "Sarjana", 2028
        );

        String[] nilai = {"A", "A-", "B+", "B"};
        double ip = mhs.calculateGPA(nilai);

        System.out.println("Nama: " + mhs.getName());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Gelar: " + mhs.getDegree());
        System.out.println("Jurusan awal: " + mhs.getMajor());
        System.out.printf("IPK: %.2f%n", ip);

        mhs.changeMajor("Matematika");
        System.out.println("Jurusan setelah diubah: " + mhs.getMajor());
        System.out.println("Tahun lulus diharapkan: " + mhs.getExpectedGraduationYear());
    }
}