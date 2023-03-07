package com.jwan.dao;

import com.jwan.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jwan
 * @since 2023-03-07
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
