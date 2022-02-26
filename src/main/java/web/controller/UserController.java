package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getUsers() {

        return "users";
    }

    @GetMapping("/new")
    public String newUser() {

        return "new";
    }

    @GetMapping("/edit")
    public String editUser() {

        return "edit";
    }
}
