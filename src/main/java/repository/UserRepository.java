package repository;

import entity.UserEntity;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {

    /**
    *@author: Quang Hiệp
    *@description: Lấy ra thông tin Employee và Manager có bằng project id
    *@date: 2024/07/09
    */
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
    *@description: Phương thức lấy ra thông tin user từ ResultSet
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
