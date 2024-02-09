public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        // find a student by id
        String id = savedStudent.id();
        Student foundStudent = studentService.findStudentById("123");
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        }
    }
}
