package com.brunocamps.coursedemo.Course.Demo.repositories;

import com.brunocamps.coursedemo.Course.Demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
