//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import web.model.User;
//import web.service.UserService;
//
//@Controller
//public class UserController {
//
//    private UserService userService;
//
//    public UserController() {
//    }
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//
////    @GetMapping("/hello")
////    public String printWelcome(ModelMap model) {
////        List<String> messages = new ArrayList<>();
////        messages.add("Hello!");
////        messages.add("I'm Spring MVC-SECURITY application");
////        messages.add("5.3.0 version by oct'21 ");
////        model.addAttribute("messages", messages);
////        return "/hello";
////    }
//
////    @GetMapping("/login")
////    public String loginPage() {
////        return "/login";
////    }
//
//    @GetMapping("/user/{id}")
//    public String usersPage(Model model, @PathVariable Long id) {
//        model.addAttribute("user", userService.getUser(id));
//        return "user";
//    }
//
//    @GetMapping
//    public String showUser(Model model) {
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        model.addAttribute(user);
//        return "user";
//    }
//
//}
