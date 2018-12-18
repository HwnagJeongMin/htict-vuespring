package com.hanwha.vuespringboot.content;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentController{

    @RequestMapping(value="/test")
    public String testSpringBoot(){
        return "Spring boot <-> Vue.js Test !! ";
    }
}
