package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.JpaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jpa")
public class JpaController {

    @Autowired
    JpaService jpaService;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return jpaService.getAllStudents();
    }
    @GetMapping("students/{rno}")
    public ResponseEntity<Student> getStudentById(@Valid @PathVariable int rno){
        return jpaService.getStudentById(rno);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student){
        return jpaService.addStudent(student);
    }
    @PutMapping("students/{rno}")
    public String updateStudent(@PathVariable int rno, @RequestBody Student student){
        return jpaService.updateStudent(rno,student);
    }
    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable int rno){
        return jpaService.deleteStudent(rno);
    }

    @DeleteMapping("students")
    public String deleteAllStudents(){
        return jpaService.deleteAllStudents();
    }

    @GetMapping("students/custom")
    public List<Student> getUserByGenderTech(
            @Param("gender") String gender,
            @Param("tech") String tech
    ){
        return jpaService.getUserByGenderAndTech(gender, tech);
    }

    @GetMapping("students/tech/{tech}")
    public List<Student> getStudentByTech(@PathVariable String tech){
        return jpaService.getStudentByTech(tech);
    }

    // Native Query
    @PostMapping("students/filter")
    public List<Student> getStudentByGenAndTech(
            @Param("gender") String gender,
            @Param("tech") String tech
    ){
        return jpaService.getStudentByGenAndTech(gender, tech);
    }
}
