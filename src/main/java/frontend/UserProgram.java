package frontend;

import controller.UserController;
import repository.UserRepository;
import service.UserService;

public class UserProgram {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);
        UserFunction userFunction = new UserFunction(userController);
        userFunction.showMenu();
    }
}
