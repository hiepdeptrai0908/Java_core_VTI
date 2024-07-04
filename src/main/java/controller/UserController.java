package controller;

import entity.User;
import lombok.AllArgsConstructor;
import service.IUserService;
import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService iUserService;

    public List<User> findAll() {
        return iUserService.findAll();
    }

}
