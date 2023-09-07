package com.rchf.readerappdal.services.impl;

import com.rchf.readerappdal.entities.Gender;
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
        return readerRepository.save(reader);
    }

    @Override
    public Reader saveGender(Reader reader) {
        return readerRepository.save(reader);
    }

    @Override
    public Reader updateGender(Reader reader) {
        return readerRepository.save(reader);
    }

    @Override
    public void deleteReader(Long id) {
        readerRepository.deleteById(id);
    }

    @Override
    public List<Reader> getReaderList() {
        List<Reader> readerList = (List<Reader>) readerRepository.findAll();
        return readerList;
    }

    @Override
    public List<Gender> getGenderList() {
        return null;
    }

    @Override
    public List<Reader> getGenderListByReader(String name) {
        return null;
    }
}
