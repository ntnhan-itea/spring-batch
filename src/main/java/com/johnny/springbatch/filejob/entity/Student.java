package com.johnny.springbatch.filejob.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;


}
