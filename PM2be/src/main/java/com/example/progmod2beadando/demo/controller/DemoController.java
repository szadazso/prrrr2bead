package com.example.progmod2beadando.demo.controller;

import com.example.progmod2beadando.demo.pojos.CliDataPojos;
import com.example.progmod2beadando.demo.services.CliDataService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class DemoController {
    private static final Logger LOGGER = LogManager.getLogger(DemoController.class);

    @Autowired
    CliDataService cliDataService;

    @RequestMapping(value = "/kutya", method = RequestMethod.GET)
    public List<CliDataPojos> kutya()
    {
        List l = cliDataService.findAll();
        return l;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView test()
    {
        ModelAndView view = new ModelAndView("index");
        return view;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public ModelAndView submit(String bx)
    {
        ModelAndView view = new ModelAndView("result");
        CliDataPojos end = cliDataService.findByName(bx);
        try
        {
            view.addObject("id",end.getId());
            view.addObject("name",end.getName());
            view.addObject("tel",end.getTel());
            view.addObject("email",end.getEmail());
            view.addObject("desc",end.getDesc());
            view.addObject("gender",end.getGender());
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
        return view;
    }
}