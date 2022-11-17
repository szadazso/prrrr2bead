package com.example.progmod2beadando.demo.pojos;

import com.example.progmod2beadando.demo.enums.Gender;
import lombok.Data;
import java.io.Serializable;

@Data
public class CliDataPojos implements Serializable {
    private Serializable id;
    private String name;
    private String email;
    private String tel;
    private String desc;
    private Gender gender;
}