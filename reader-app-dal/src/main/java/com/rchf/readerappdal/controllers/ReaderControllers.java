package com.rchf.readerappdal.controllers;

import com.rchf.readerappdal.entities.Reader;
import com.rchf.readerappdal.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReaderControllers {

    @Autowired
    private ReaderService readerService;

    public ResponseEntity<Reader>saveReader() {
        return null;
    }

    public ResponseEntity<Reader>saveGender() {
        return null;
    }

    public ResponseEntity<Reader>UpdateGender() {
        return null;
    }

    public ResponseEntity<Void>deleteReader() {
        return null;
    }

    public ResponseEntity<List<Reader>>getReaderList() {
        return null;
    }

    public ResponseEntity<List<Reader>>getGenderList() {
        return null;
    }

    public ResponseEntity<List<Reader>>getGenderListByReader() {
        return null;
    }


}
