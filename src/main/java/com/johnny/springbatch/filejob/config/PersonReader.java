package com.johnny.springbatch.filejob.config;

import com.johnny.springbatch.filejob.dto.Person;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;

public class PersonReader extends FlatFileItemReader<Person> {

}
