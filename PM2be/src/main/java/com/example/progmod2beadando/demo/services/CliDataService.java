package com.example.progmod2beadando.demo.services;

import com.example.progmod2beadando.demo.pojos.CliDataPojos;
import java.util.List;

public interface CliDataService
{
    List<CliDataPojos> findAll();
    CliDataPojos findByName(String in_name);
}