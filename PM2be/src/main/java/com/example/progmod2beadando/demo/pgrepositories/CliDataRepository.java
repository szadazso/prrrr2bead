package com.example.progmod2beadando.demo.pgrepositories;

import com.example.progmod2beadando.demo.pgmodels.CliData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CliDataRepository extends JpaRepository<CliData, Long>
{

}