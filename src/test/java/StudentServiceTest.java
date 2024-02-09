import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @org.junit.jupiter.api.Test
    void findStudentById() {

        assertThrows(IllegalArgumentException.class, () -> {
            StudentService studentService = new StudentService();
            studentService.findStudentById("123");
        });
        }
    }