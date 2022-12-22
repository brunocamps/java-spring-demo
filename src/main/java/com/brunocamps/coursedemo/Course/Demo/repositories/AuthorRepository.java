package com.brunocamps.coursedemo.Course.Demo.repositories;

import com.brunocamps.coursedemo.Course.Demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
