package com.johnny.springbatch.filejob.config;

import com.johnny.springbatch.filejob.dto.Person;
import com.johnny.springbatch.filejob.entity.Student;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Student> {
    @Override
    public Student process(Person item) throws Exception {
        Student student = new Student();
        student.setAge(item.getAge());
        student.setFirstName(item.getFirstName());
        student.setLastName(item.getLastName());
        return student;
    }
}
