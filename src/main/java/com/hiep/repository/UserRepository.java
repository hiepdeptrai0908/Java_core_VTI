package com.hiep.repository;

import com.hiep.entity.User;
import com.hiep.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException {
        String sql = "SELECT * FROM users";
        try (
                Connection connection = JdbcUtil.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ) {
            List<User> users = new ArrayList<>();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setFullName(resultSet.getString("full_name"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setExpInYear(resultSet.getInt("exp_in_year"));
                user.setRole(resultSet.getString("role"));
                user.setProSkill(resultSet.getString("pro_skill"));
                users.add(user);
            }
            return users;

        }

    }
    public int create(String fullName, String email) throws SQLException {
        String sql = "INSERT INTO users(full_name, email) VALUES (?, ?)";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setString(1, fullName);
            pStmt.setString(2, email);
            return pStmt.executeUpdate();
        }
    }
}
