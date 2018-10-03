package com.example.pasha.JPAdemo;

import com.example.pasha.JPAdemo.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassRepository extends JpaRepository<Class,Integer> {
//    @Query(value = "select s.name from Student s inner join student_classes sc on s.idStudent = sc.idStudent " +
//            "inner join Class c on sc.idClass = c.idClass where c.idClass = :id", nativeQuery = true)
    List<Class> findByStudentsId(int id);
}
