package com.xw.controller.system;

import com.xw.service.system.SysUserService;
import com.xw.system.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 获取用户列表
     * @param user
     * @return
     */
    @RequestMapping(value = "/user/selectUserList",method = RequestMethod.POST)
    @ResponseBody
    public List<SysUser> selectUserList(SysUser user){
        return sysUserService.selectUserList(user);
    }
}
