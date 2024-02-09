import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @org.junit.jupiter.api.Test
    void findStudentById_whenStudentIDDoesNotExists_thenReturnException() {

        assertThrows(NoSuchElementException.class, () -> {
            StudentService studentService = new StudentService();
            studentService.findStudentById("123");
        });
        }
    }