package com.rchf.readerappdal.controllers;

import com.rchf.readerappdal.entities.Gender;
import com.rchf.readerappdal.entities.Reader;
import com.rchf.readerappdal.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReaderControllers {

    @Autowired
    private ReaderService readerService;

    @PostMapping()
    public ResponseEntity<Reader>saveReader(@RequestBody Reader reader) {
        readerService.saveReader(reader);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Reader>saveGender(@RequestBody Reader reader) {
        readerService.saveGender(reader);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Reader>UpdateGender(@RequestBody Reader reader) {
        Reader readers = readerService.updateGender(reader);
        return new ResponseEntity<>(readers, HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<Void>deleteReader(@PathVariable("id") Long id) {
        readerService.deleteReader(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Reader>>getReaderList() {
        List<Reader> readerList = readerService.getReaderList();
        return readerList != null ? new ResponseEntity<>(readerList, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping()
    public ResponseEntity<List<Gender>>getGenderList() {
        List<Gender> genderList = readerService.getGenderList();
        return genderList != null ? new ResponseEntity<>(genderList, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping()
    public ResponseEntity<List<Reader>>getGenderListByReader(@PathVariable("name") String name) {
        List<Reader> readers = readerService.getGenderListByReader(name);
        return readers != null ? new ResponseEntity<>(readers, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
