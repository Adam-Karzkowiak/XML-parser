package parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import entity.Student;
import lombok.SneakyThrows;
import repository.StudentRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class XMLReader {

    @SneakyThrows
    public static void readXML() {
        ObjectMapper mapper = new XmlMapper();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("studentsOut.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        TypeReference<List<Student>> typeReference = new TypeReference<List<Student>>() {
        };
        List<Student> studentsList = mapper.readValue(inputStream, typeReference);
        StudentRepository.studentList.addAll(studentsList);
    }
}
