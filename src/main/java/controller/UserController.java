package controller;

import entity.UserEntity;
import lombok.AllArgsConstructor;
import service.IUserService;
import service.UserService;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService iUserService;

    /**
     *@author: Quang Hiệp
     *@description: Lấy ra thông tin Employee và Manager có bằng project id
     *@date: 2024/07/09
     */
    public List<UserEntity> findEmployeeAndManagerByProjectId(int projectId) {
        return iUserService.findEmployeeAndManagerByProjectId(projectId);
    }

    /**
     *@author: Quang Hiệp
     *@description: Tra cứu thông tin Admin bằng email và password
     *@date: 2024/07/09
     */
    public UserEntity findAdminByEmailAndPassword(String email, String password) {
        return iUserService.findAdminByEmailAndPassword(email, password);
    }

    /**
     *@author: Quang Hiệp
     *@description: Tạo user với 3 tham số truyền vào là "full name, email, role"
     *@date: 2024/07/09
     */
    public int createUser(String fullName, String email) {
        return iUserService.createUser(fullName, email);
    }
}
