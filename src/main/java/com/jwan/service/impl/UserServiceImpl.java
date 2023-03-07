package com.jwan.service.impl;

import com.jwan.domain.User;
import com.jwan.dao.UserDao;
import com.jwan.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jwan
 * @since 2023-03-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
