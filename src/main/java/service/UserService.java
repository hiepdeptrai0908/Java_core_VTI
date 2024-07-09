package service;

import entity.UserEntity;
import lombok.AllArgsConstructor;
import repository.IUserRepository;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class UserService implements IUserRepository, IUserService {
    private IUserRepository iUserRepository;

    /**
    *@author: Quang Hiệp
    *@description: Lấy ra thông tin Employee và Manager có bằng project id
    *@date: 2024/07/09
    */
    @Override
    public List<UserEntity> findEmployeeAndManagerByProjectId(int projectId){
        try {
            return iUserRepository.findEmployeeAndManagerByProjectId(projectId);
        } catch (SQLException | IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Tra cứu thông tin Admin bằng email và password
    *@date: 2024/07/09
    */
    @Override
    public UserEntity findAdminByEmailAndPassword(String email, String password){
        try {
            return iUserRepository.findAdminByEmailAndPassword(email, password);
        } catch (SQLException | IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
            return null;
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Tạo user với 3 tham số truyền vào là "full name, email"
    *@date: 2024/07/09
    */
    @Override
    public int createUser(String fullName, String email){
        try {
            return iUserRepository.createUser(fullName, email);
        } catch (SQLException | IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
            System.err.println("e.getLocalizedMessage() = " + e.getLocalizedMessage());
            return 0;
        }
    }
}
