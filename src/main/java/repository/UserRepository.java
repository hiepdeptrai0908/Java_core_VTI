package repository;

import entity.UserEntity;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {

    /**
    *@author: Quang Hiệp
    *@description: Lấy ra thông tin Employee và Manager có bằng project id
    *@date: 2024/07/09
    */
    @Override
    public List<UserEntity> findEmployeeAndManagerByProjectId(int projectId) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role IN('EMPLOYEE', 'MANAGER') and project_id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStatement = connection.prepareStatement(sql)
        ) {
            pStatement.setInt(1, projectId);
            try (ResultSet rs = pStatement.executeQuery()) {
                List<UserEntity> users = new LinkedList<UserEntity>();
                while (rs.next()) {
                    UserEntity user = getUser(rs);
                    users.add(user);
                }
                 return users;
            }
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Tra cứu thông tin Admin bằng email và password
    *@date: 2024/07/09
    */
    @Override
    public UserEntity findAdminByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_admin_by_email_and_password( ?, ?)} ";
        try(
                Connection connection = JdbcUtil.getConnection();
                CallableStatement cStatement = connection.prepareCall(sql)
        ){
            cStatement.setString(1, email);
            cStatement.setString(2, password);
            try(ResultSet rs = cStatement.executeQuery()) {
                if (rs.next()) {
                    return getUser(rs);
                }else {
                    return null;
                }
            }
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Tạo user với 2 tham số truyền vào là "full name, email"
    *@date: 2024/07/09
    */
    @Override
    public int createUser(String fullName, String email)
            throws SQLException, IOException {
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

    /**
    *@author: Quang Hiệp
    *@description: Phương thức lấy ra thông tin user từ ResultSet trả về
    *@date: 2024/07/09
    */
    private static UserEntity getUser(ResultSet rs) throws SQLException {
        UserEntity user = new UserEntity();
        user.setId(rs.getInt("id"));
        user.setFullName(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setProjectId(rs.getInt("project_id"));
        user.setRole(rs.getString("role"));
        return user;
    }
}
