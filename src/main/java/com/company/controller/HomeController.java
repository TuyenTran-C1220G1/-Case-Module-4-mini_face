package com.company.controller;

import com.company.model.Role;
import com.company.model.User;
import com.company.repository.IUserRepository;
import com.company.service.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    IUserRepository userRepository;

    @Autowired
    UserDetailServiceImpl userDetailServiceImpl;

    @GetMapping("/home")
    public ModelAndView showHome(Principal principal) {
        principal.getName();
        User user = userRepository.findByUsername(principal.getName());
        ModelAndView modelAndView = new ModelAndView("/newsfeed");
        modelAndView.addObject("user", user);
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
    public ModelAndView registerForm() {
        ModelAndView modelAndView = new ModelAndView("/register");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView doRegister(@ModelAttribute User user) {
        //check email trùng
        //check username trùng
        Role role = new Role(1L, "ROLE_USER");// mặc định quyền user
        List<Role> roles = new ArrayList<>();
        roles.add(role);
        user.setRoles(roles);
        userDetailServiceImpl.save(user);
        ModelAndView modelAndView = new ModelAndView("/login");
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
