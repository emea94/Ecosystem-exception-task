import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student findStudentById(String id){
        try {
            return repo.findStudentById(id)
                    .orElseThrow(() -> new NoSuchElementException("Student with id " + id + " not found"));
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
