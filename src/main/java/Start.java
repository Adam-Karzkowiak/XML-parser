import entity.Student;
import parser.ObjectToXML;
import parser.XMLReader;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;


//TODO move it to tests
public class Start {
    public static void main(String[] args) {
        String[] subjects = {"pl", "eng", "math"};
        Student student = new Student("Adam", "Karzkowiak", subjects);
        Student studentTwo = new Student("Mada", "Kaszkowski", subjects);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(studentTwo);
        ObjectToXML.saveStudentToXML(studentList);
        XMLReader.readXML();
        System.out.println(StudentRepository.studentList.toString());
    }
}
