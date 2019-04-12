package com.juzi.wage.model.dto;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.model.dto
 * @ClassName: UserInfoDto
 * @Author: wanzh
 * @Description: ${description}
 * @Date: 2019/4/10 23:40
 * @Version: 1.0
 */
public class UserInfoDto {
    private String userId;
    private String pwd;
    private String role;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" +
                "userId='" + userId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
