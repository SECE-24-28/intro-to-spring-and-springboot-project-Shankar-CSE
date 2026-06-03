//package com.example.demo.controller;
//
//
//import com.example.demo.model.Student;
//import com.example.demo.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    StudentService studentService;
//
//
//    @GetMapping("students")
//    public List<Student> getAllStudent(){
//        return studentService.getAllStudents();
//    }
//
//    @GetMapping("students/{rno}")
//    public String getStudentByRno(@PathVariable int rno){
//        return studentService.getStudentByRno(rno);
//    }
//
//    @PostMapping("students")
//    public Student addStudent(@RequestBody Student student){
//        return studentService.addstudent(student);
//    }
//
//    @PutMapping("students/{rno}")
//    public String updateStudent(@PathVariable int rno,@RequestBody Student student){
//        return studentService.updateStudent(rno,student);
//    }
//
//    @DeleteMapping("students/{rno}")
//    public String deleteStudent(@PathVariable int rno){
//        return studentService.deleteStudent(rno);
//    }
//}
