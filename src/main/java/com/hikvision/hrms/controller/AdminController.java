package com.hikvision.hrms.controller;

import com.hikvision.hrms.model.Admin;
import com.hikvision.hrms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author : yangliu449
 * @date :  2019/1/29
 */
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/index")
    @ResponseBody
    public  ModelAndView showAdmin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index");
        return modelAndView;
    }

    @RequestMapping("/dd")
    @ResponseBody
    public String dd(){
        String s = "sss";
        return s;
    }
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        System.out.println(username);
        System.out.println(password);
        return "ddd";
    }


}
