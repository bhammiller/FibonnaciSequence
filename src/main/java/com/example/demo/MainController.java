package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class MainController {
    @RequestMapping ("/")
    public ArrayList fibonnaciSequencing(@RequestParam("number") Integer input_number) {
        /*if (input_number < 4){
            return result = "Please Try again with a anumber less than 4";
            }*/
        FibonnaciSequence fibonnaciSequence = new FibonnaciSequence();
        ArrayList result = fibonnaciSequence.fibonnaciScanner(input_number);
        return result;
        /*
        if (input_number <4)
            answer_display = "Please Try again with a anumber less than 4";
            */
    }
    }