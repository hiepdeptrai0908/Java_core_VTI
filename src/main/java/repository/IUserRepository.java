package repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> findAll() throws SQLException, IOException;
}
