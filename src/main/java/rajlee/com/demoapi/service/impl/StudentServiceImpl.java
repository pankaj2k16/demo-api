package rajlee.com.demoapi.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rajlee.com.demoapi.dto.StudentDto;
import rajlee.com.demoapi.entity.Student;
import rajlee.com.demoapi.exception.ResourceNotFoundException;
import rajlee.com.demoapi.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(this::mapToDto)
                .toList();
    }

    @Override
    public StudentDto getStudentById(String id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with ID: " + id));
        return mapToDto(student);
    }

    @Override
    public StudentDto createStudent(StudentDto dto) {
        Student student = new Student(dto.id(), dto.firstName(), dto.lastName(), dto.dob(), dto.address());
        Student savedStudent = studentRepository.save(student);
        return mapToDto(savedStudent);
    }

    @Override
    public StudentDto updateStudent(String id, StudentDto dto) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with ID: " + id));

        existingStudent.setFirstName(dto.firstName());
        existingStudent.setLastName(dto.lastName());
        existingStudent.setDob(dto.dob());
        existingStudent.setAddress(dto.address());

        Student updatedStudent = studentRepository.save(existingStudent);
        return mapToDto(updatedStudent);
    }

    @Override
    public void deleteStudent(String id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with ID: " + id));
        studentRepository.delete(student);
    }

    // Helper method for mapping (Consider using MapStruct for larger projects)
    private StudentDto mapToDto(Student student) {
        return new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getDob(),
                student.getAddress()
        );
    }
}