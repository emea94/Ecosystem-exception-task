import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService = new StudentService();

    @org.junit.jupiter.api.Test
    void findStudentById_whenStudentIDDoesNotExists_thenReturnException() {

        assertThrows(NoSuchElementException.class, () -> studentService.findStudentById("123"));
    }
}