package com.example.pasha.JPAdemo;

import com.example.pasha.JPAdemo.model.Class;
import com.example.pasha.JPAdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import static javax.persistence.criteria.JoinType.INNER;

@Repository()
public interface StudentRepository extends JpaRepository<Student,Integer> {
   // @Query(value = "select c.name from Student s inner join student_classes sc on s.idStudent = sc.idStudent" +
   //         " inner join Class c on sc.idClass = c.idClass where s.idStudent = :id", nativeQuery = true)
    List<Student> findAllByClassesId(int id);

}
