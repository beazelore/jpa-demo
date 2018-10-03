package com.example.pasha.JPAdemo;

import com.example.pasha.JPAdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository()
public interface StudentRepository extends JpaRepository<Student,Integer> {
   // @Query(value = "select c.name from Student s inner join student_classes sc on s.idStudent = sc.idStudent" +
   //         " inner join Class c on sc.idClass = c.idClass where s.idStudent = :id", nativeQuery = true)
    List<Student> findByClassesId(int id);

}
