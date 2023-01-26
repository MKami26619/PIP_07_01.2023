public class Main {
    public static void main(String[] args) {
        // ZADANIE 1
        Student student1 = new Student();
        student1.name = "Kamil Michalski";
        student1.studentNumber = 987654321;
        Student student2 = new Student();
        System.out.println("Nazwa 1-szego studenta: " + student1.name);
        System.out.println("Nazwa 2-giego studenta: " + student2.name);
        System.out.println("Numer 1-szego studenta: " + student1.studentNumber);
        System.out.println("Numer 2-giego studenta: " + student2.studentNumber);

        // ZADANIE 2
        SecretStudent secretStudent = new SecretStudent();
        System.out.println("Imie tajemnego studenta: " + secretStudent.getName());
        System.out.println("Nazwisko tajemnego studenta: " + secretStudent.getSurname());
        System.out.println("Numer ID tajemnego studenta: " + secretStudent.getStudentNumber());

        // ZADANIE 3
        secretStudent.setName("Kamil Nowak");
        System.out.println("Tajemniczy student: " + secretStudent.getName());

        // ZADANIE 4
        SecretStudent student3 = new SecretStudent();
        student3.readFromScanner();
        student3.print();
        SecretStudent student4 = new SecretStudent();
        student4.readFromScanner();
        student4.print();
    }
}
