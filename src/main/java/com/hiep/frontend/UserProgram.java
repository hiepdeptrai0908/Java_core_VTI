package com.hiep.frontend;

import com.hiep.repository.UserRepository;
import com.hiep.util.JdbcUtil;

import java.sql.SQLException;

public class UserProgram {
    public  static void main(String[] args) throws SQLException {
        UserRepository repo = new UserRepository();
        UserFunction userFunction = new UserFunction(repo);
        userFunction.showMenu();
    }
}
