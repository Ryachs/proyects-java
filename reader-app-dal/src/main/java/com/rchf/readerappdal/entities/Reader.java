package com.rchf.readerappdal.entities;

import lombok.Data;

import java.util.List;

@Data
public class Reader {
    private Long id;
    private String name;
    private int age;
    private List<Gender> gender;
}
