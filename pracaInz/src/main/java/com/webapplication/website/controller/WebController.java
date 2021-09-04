package com.webapplication.website.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class WebController {

    @RequestMapping("/dataOne")
    public String dataOneWeb() {
        return "dataOne";
    }
    @RequestMapping("/dataTwo")
    public String dataTwoWeb() {
        return "dataTwo";
    }
    @RequestMapping("/dataThree")
    public String dataThreeWeb() {
        return "dataThree";
    }


}
