package CRUD.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {



    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String loginSucses(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String loginUN = auth.getName();//get logged in username
        model.addAttribute("loginUN", loginUN);
        return "loginsuccess";
    }

}
