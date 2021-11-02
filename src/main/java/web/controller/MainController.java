package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import web.service.UserService;

@Controller
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;

//        Role roleAdmin = new Role("ROLE_ADMIN");
//        Role roleUser = new Role("ROLE_USER");
//        User admin = new User("Admin", "Adminov", "admin@mail.com", "admin", "admin");
//        User user = new User("User", "Userov", "user@mail.com", "user", "user");
//        admin.setRoles(Stream.of(roleAdmin, roleUser).collect(Collectors.toCollection(HashSet::new)));
//        user.setRoles(Stream.of(roleUser).collect(Collectors.toCollection(HashSet::new)));
//        userService.addUser(admin);
//        userService.addUser(user);

    }

    @GetMapping("/login")
    public ModelAndView start() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login");
        return modelAndView;
    }

}
