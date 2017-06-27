package com.zsj.dao;

import com.zsj.bean.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhoushijie on 2017/6/22.
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
