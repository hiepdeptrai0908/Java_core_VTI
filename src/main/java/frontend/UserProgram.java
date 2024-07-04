package frontend;

import controller.UserController;
import repository.UserRepository;
import service.UserService;

public class UserProgram {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);
        UserController controller = new UserController(service);
        UserFunction function = new UserFunction(controller);
        function.showMenu();
    }
}
