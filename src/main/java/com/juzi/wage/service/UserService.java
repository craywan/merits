package com.juzi.wage.service;

import com.juzi.wage.model.dto.UserInfoDto;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.service
 * @ClassName: UserService
 * @Author: wanzh
 * @Description: ${description}
 * @Date: 2019/4/10 23:37
 * @Version: 1.0
 */
public interface UserService {
    //检测系统是否开启
    boolean isNotOpen();
    //检验登录账号密码 0表示错误，1表示正确，2表示管理员
    int checkLogin(UserInfoDto userInfoDto);

}
