package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
    @GetMapping("/home")
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("/newsfeed");
        return modelAndView;
    }

    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView("/about");
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }

    @GetMapping("/logout")
    public ModelAndView logout() {
        ModelAndView modelAndView = new ModelAndView("/logout");
        return modelAndView;
    }

    @GetMapping("/register")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView("/register");
        return modelAndView;
    }

    @GetMapping("/timeline")
    public ModelAndView timeline() {
        ModelAndView modelAndView = new ModelAndView("/timeline");
        return modelAndView;
    }

    @GetMapping("/timeline-friends2")
    public ModelAndView timeline_friends() {
        ModelAndView modelAndView = new ModelAndView("/timeline-friends2");
        return modelAndView;
    }

    @GetMapping("/timeline-photos")
    public ModelAndView timeline_photos() {
        ModelAndView modelAndView = new ModelAndView("/timeline-photos");
        return modelAndView;
    }

    @GetMapping("/setting")
    public ModelAndView setting() {
        ModelAndView modelAndView = new ModelAndView("/setting");
        return modelAndView;
    }

}
