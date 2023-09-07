package com.rchf.readerappdal.services;

import com.rchf.readerappdal.entities.Gender;
import com.rchf.readerappdal.entities.Reader;

import java.util.List;

public interface ReaderService {

    Reader saveReader(Reader reader);
    Reader saveGender(Reader reader);
    Reader updateGender(Reader reader);
    void deleteReader(Long id);
    List<Reader> getReaderList();
    List<Gender> getGenderList();
    List<Reader> getGenderListByReader(String name);
}
