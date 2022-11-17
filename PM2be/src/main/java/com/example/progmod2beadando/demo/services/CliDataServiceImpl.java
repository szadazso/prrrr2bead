package com.example.progmod2beadando.demo.services;


import com.example.progmod2beadando.demo.pgmodels.CliData;
import com.example.progmod2beadando.demo.pgrepositories.CliDataRepository;
import com.example.progmod2beadando.demo.pojos.CliDataPojos;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class CliDataServiceImpl implements CliDataService
{
    private final CliDataRepository cliDataRepository;
    static BufferedReader scanf = new BufferedReader(new InputStreamReader(System.in));

    @Autowired
    public CliDataServiceImpl(CliDataRepository cliDataRepository)
    {
        this.cliDataRepository = cliDataRepository;
    }

    @Override
    public List<CliDataPojos> findAll()
    {
        List<CliData> cliDataList = cliDataRepository.findAll();
        List<CliDataPojos> result = new ArrayList<>();
        for(CliData x : cliDataList)
        {
            CliDataPojos entity = new CliDataPojos();
            entity.setId(x.getCliId());
            entity.setName(x.getName());
            entity.setEmail(x.getEmail());
            entity.setTel(x.getTel());
            entity.setDesc(x.getDescription());
            entity.setGender(x.getGender());
            result.add(entity);
        }
        for(CliData gd : cliDataList)
        {
            System.out.println(gd.getName());
        }
        return result;
    }

    @Override
    public CliDataPojos findByName(String in_name)
    {
        List<CliData> cliDataList = cliDataRepository.findAll();
        CliDataPojos result = new CliDataPojos();
        for(CliData x : cliDataList)
        {
            if (in_name.equals(x.getName()))
            {
                result.setId(x.getCliId());
                result.setName(x.getName());
                result.setEmail(x.getEmail());
                result.setTel(x.getTel());
                result.setDesc(x.getDescription());
                result.setGender(x.getGender());
            }
        }
        return result;
    }
}