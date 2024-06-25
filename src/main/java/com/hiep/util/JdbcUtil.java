package com.hiep.util;

import com.hiep.frontend.UserFunction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lesson_10";
        String user = "root";
        String password = "Hiep1234";
        return DriverManager.getConnection(url, user, password);
    }

    public static void checkConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("Kết nối thành công: " + connection.getCatalog());
        } catch (SQLException e) {
            System.err.println("Kết nối thất bại: " + e.getMessage());
        }
    }
}
