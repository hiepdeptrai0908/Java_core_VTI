package service;

import entity.User;
import lombok.AllArgsConstructor;
import repository.IUserRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class UserService implements IUserService {
    private IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        try {
            return iUserRepository.findAll();
        } catch (SQLException | IOException exception) {
            return Collections.emptyList();
        }
    }
}
