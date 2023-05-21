package ua.lviv.iot.spring.first.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.first.rest.models.Student;

@RequestMapping("/students")
@RestController
public class StudentsController {

    @GetMapping(path = "/{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        System.out.println(studentId);
        return new Student("Bohdan", "Kostiuk");
    }
    
    @PostMapping(produces = { })
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student);
        student.setId(245);
        return student;
    }
}
