package parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import entity.Student;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ObjectToXML {

    public static void saveStudentToXML(List<Student> entity) {
        ObjectMapper mapper = new XmlMapper();
        try {
            mapper.writeValue(new File("studentsOut.xml"), entity);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
