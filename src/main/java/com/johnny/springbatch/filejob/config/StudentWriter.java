package com.johnny.springbatch.filejob.config;

import com.johnny.springbatch.filejob.entity.Student;
import com.johnny.springbatch.filejob.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;


public class StudentWriter implements ItemWriter<Student> {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void write(Chunk<? extends Student> chunk) {
        chunk.getItems().forEach(studentRepository::save);
    }
}
