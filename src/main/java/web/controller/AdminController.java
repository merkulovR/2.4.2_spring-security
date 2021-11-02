package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.RoleService;
import web.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping
    public String getAdminPage(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "/admin";
    }
//
//    @GetMapping("/users")
//    public String getAllUsers(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "/users-list";
//    }
//
//    @GetMapping("/user-create")
//    public String createUserForm(@ModelAttribute("user") User user) {
//        return "/user-create";
//    }
//
//    @PostMapping("/user-create")
//    public String createUser(User user) {
//        userService.addUser(user);
//        return "redirect:/users";
//    }
//
//    @DeleteMapping("/user-delete/{id}")
//    public String deleteUser(@PathVariable("id") Long id) {
//        userService.delete(id);
//        return "redirect:/users";
//    }
//
//    @GetMapping("/user-update/{id}")
//    public String updateUserForm(@PathVariable("id") Long id, Model model) {
//        User user = userService.getUser(id);
//        model.addAttribute("user", user);
//        return "/user-update";
//    }
//
//    @PutMapping("/user-update")
//    public String updateUser(@ModelAttribute("user") User user) {
//        System.out.println("before");
//        userService.update(user);
//        return "redirect:/users";
//    }
}
