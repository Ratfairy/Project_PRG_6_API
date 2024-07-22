package id.co.astratech.rest;

import id.co.astratech.repository.LoginRepository;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.service.UserService;
import id.co.astratech.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserRest {

    @Autowired
    private UserService userService;

    public UserRest(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public DtoResponse getAllUsers(@RequestParam("prodi") String prodi) {
        return userService.getAllUsers(prodi);
    }

    @GetMapping("/getUser")
    public DtoResponse getUserById(@RequestParam("username") String username) {
        return userService.getUserById(username);
    }

    @GetMapping("/login")
    public DtoResponse login(@RequestParam("username") String username,@RequestParam("password") String password) {
        return userService.login(username,password);
    }

    @PostMapping("/addUser")
    public DtoResponse saveUser(@RequestBody UserVo user) {
        return userService.saveUser(user);
    }
}
