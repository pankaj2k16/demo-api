package rajlee.com.demoapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rajlee.com.demoapi.entity.Student;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}
