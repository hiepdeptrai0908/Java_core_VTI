package service;

import entity.UserEntity;

import java.util.List;

public interface IUserService {
    List<UserEntity> findEmployeeAndManagerByProjectId(int projectId);

    UserEntity findAdminByEmailAndPassword(String email, String password);

    int createUser(String fullName, String email);
}
