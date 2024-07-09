package repository;

import entity.UserEntity;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<UserEntity> findEmployeeAndManagerByProjectId(int projectId) throws SQLException, IOException;

    UserEntity findAdminByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int createUser(String fullName, String email) throws SQLException, IOException;
}
