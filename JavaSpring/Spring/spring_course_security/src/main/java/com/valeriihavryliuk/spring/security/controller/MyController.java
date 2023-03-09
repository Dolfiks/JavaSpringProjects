package com.valeriihavryliuk.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String getInfoForAllEmps(){
        return "view_for_all_employees";
    }
@RequestMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "view_for_hr";
}

    @RequestMapping("/manager_info")
    public String getInfoOnlyForManager(){
        return "view_for_manager";
    }
}
