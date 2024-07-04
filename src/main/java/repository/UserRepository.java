package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public List<User> findAll() throws SQLException, IOException {
        List<User> users = new LinkedList<>();

        String sql = "select * from users";
        try(
                Connection connection = JdbcUtil.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ){
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setFullName(resultSet.getString(2));
                user.setEmail(resultSet.getString(3));
                user.setPassword(resultSet.getString(4));
                user.setExpInYear(resultSet.getString(5));
                user.setProSkill(resultSet.getString(6));
                user.setProjectId(resultSet.getInt(7));
                user.setRole(resultSet.getString(8));
                users.add(user);
            }
        }
        return users;
    }
}
