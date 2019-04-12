package com.juzi.wage.service.impl;

import com.juzi.wage.dao.ManagerMapper;
import com.juzi.wage.dao.UserMapper;
import com.juzi.wage.model.dto.UserInfoDto;
import com.juzi.wage.model.entity.Manager;
import com.juzi.wage.model.entity.ManagerExample;
import com.juzi.wage.model.entity.User;
import com.juzi.wage.model.entity.UserExample;
import com.juzi.wage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.service.impl
 * @ClassName: UserServiceInfo
 * @Author: wanzh
 * @Description: ${description}
 * @Date: 2019/4/10 23:42
 * @Version: 1.0
 */
@Service
public class UserServiceInfo implements UserService {
    @Resource
    private ManagerMapper managerMapper;
    @Resource
    private UserMapper userMapper;
    @Override
    public boolean isNotOpen() {
        ManagerExample managerExample = new ManagerExample();
        List<Manager> managerList=managerMapper.selectByExample(managerExample);
        String status="0";
        if(managerList!=null&&!managerList.isEmpty()){
            status=managerList.get(0).getSystemStatus();
    }
        if("1".equals(status)){
            return true;
        }
        return false;
    }

    @Override
    public int checkLogin(UserInfoDto userInfoDto) {
        //获取密码
        UserExample userExample = new UserExample();
        userExample.createCriteria().andJobNumberEqualTo(userInfoDto.getUserId());
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList!=null&&!userList.isEmpty()){
            //判断密码是否相等

            if(userList.get(0).getPassword().equals(userInfoDto.getPwd())){
                //判断角色,管理员
                if("1".equals(userList.get(0).getRole())){
                        return 2;
                }
                return 1;//用户
            }
        }

        return 0;//密码错误
    }
}
