package by.belstu.stankevich.controllers;

import by.belstu.stankevich.models.User;
import by.belstu.stankevich.repositories.UserRepository;
import by.belstu.stankevich.utilities.SimpleHash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class AdminController {
    private final UserRepository userRepository;

    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String login
            , @RequestParam String password, @RequestParam String admin) {
        String rez = "Success";
        try {
            User n = new User();
            n.setLogin(login);
            n.setPassword(SimpleHash.makeMd5HashInBase64Format(password));
            n.setAdmin(Boolean.valueOf(admin));
            userRepository.save(n);

        }
        catch (Exception exception){
            rez=exception.getMessage();
        }

        return rez;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}