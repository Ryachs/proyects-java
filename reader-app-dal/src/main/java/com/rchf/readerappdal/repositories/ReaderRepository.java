package com.rchf.readerappdal.repositories;

import com.rchf.readerappdal.entities.Reader;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderRepository extends CrudRepository<Reader, Long> {

    @Query("")
    List<Reader> getGenderListByReader(String name);
}
