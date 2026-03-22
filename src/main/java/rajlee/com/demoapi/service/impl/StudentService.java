package rajlee.com.demoapi.service.impl;


import rajlee.com.demoapi.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(String id);
    StudentDto createStudent(StudentDto studentDto);
    StudentDto updateStudent(String id, StudentDto studentDto);
    void deleteStudent(String id);
}
