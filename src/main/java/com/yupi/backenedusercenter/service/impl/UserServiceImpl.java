package com.yupi.backenedusercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.backenedusercenter.model.domain.User;
import com.yupi.backenedusercenter.service.UserService;
import com.yupi.backenedusercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 97294
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2026-01-06 17:23:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




