package com.xw.service.system;

import com.xw.system.SysUser;

import java.util.List;

public interface SysUserService {

    public List<SysUser> selectUserList(SysUser user);
}
