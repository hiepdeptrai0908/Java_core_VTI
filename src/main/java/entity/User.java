package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    int id;
    String fullName;
    String email;
    String password;
    String expInYear;
    String proSkill;
    int projectId;
    Role role;

    public void setRole(String role) {
        this.role = Role.valueOf(role);
    }

    private enum Role {
        MANAGER, EMPLOYEE
    }
}

