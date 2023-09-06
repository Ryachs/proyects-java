package com.rchf.readerappdal.services.impl;

import com.rchf.readerappdal.entities.Reader;
import com.rchf.readerappdal.repositories.ReaderRepository;
import com.rchf.readerappdal.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    @Override
    public Reader saveReader(Reader reader) {
        return null;
    }

    @Override
    public Reader saveGender(Reader reader) {
        return null;
    }

    @Override
    public Reader UpdateGender(Reader reader) {
        return null;
    }

    @Override
    public void deleteReader(Long id) {
        readerRepository.deleteById(id);
    }

    @Override
    public List<Reader> getReaderList() {
        return null;
    }

    @Override
    public List<Reader> getGenderList() {
        return null;
    }

    @Override
    public List<Reader> getGenderListByReader(String name) {
        return null;
    }
}
