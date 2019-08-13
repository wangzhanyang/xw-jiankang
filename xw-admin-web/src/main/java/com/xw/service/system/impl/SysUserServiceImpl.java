package com.xw.service.system.impl;

import com.xw.client.system.SysUserClient;
import com.xw.service.system.SysUserService;
import com.xw.system.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserClient sysUserClient;

    @Override
    public List<SysUser> selectUserList(SysUser user) {
        List<SysUser> list= sysUserClient.selectUserList(user);
        return sysUserClient.selectUserList(user);
    }
}
