package rajlee.com.demoapi.service;


import rajlee.com.demoapi.dto.StudentDto;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(UUID id);
    StudentDto createStudent(StudentDto studentDto);
    StudentDto updateStudent(UUID id, StudentDto studentDto);
    void deleteStudent(UUID id);
}
