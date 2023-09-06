package com.rchf.readerappdal.services;

import com.rchf.readerappdal.entities.Reader;

import java.util.List;

public interface ReaderService {

    Reader saveReader(Reader reader);
    Reader saveGender(Reader reader);
    Reader UpdateGender(Reader reader);
    void deleteReader(Long id);
    List<Reader> getReaderList();
    List<Reader> getGenderList();
    List<Reader> getGenderListByReader(String name);
}
