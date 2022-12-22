package com.brunocamps.coursedemo.Course.Demo.repositories;

import com.brunocamps.coursedemo.Course.Demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
